public class LOngestPalindromicSubstringApproach2 {

    public static void main(String[] args) {
        String str = "12133AABBAAaaxx";
        String res = "";

        if (str.length() % 2 == 0) {

            for (int ax = 0; ax < str.length(); ax++) {
                int or = 1;
                int len = 1;

                while (ax - or >= 0 && ax + or < str.length()) {
                    if (str.charAt(ax - or) == str.charAt(ax + or)) {
                        or++;
                        len += 2;
                    } else
                        break;
                }

                if (len > res.length()) {
                    int startingIndex = ax - len / 2;
                    res = str.substring(startingIndex, startingIndex + len);
                }
            }
            System.out.println(res);
            return;
        }

        for (int ax = 0; ax < str.length() - 1; ax++) {
            int or = 1;
            int len = 0;

            while (ax - or + 1 >= 0 && ax + or < str.length()) {
                if (str.charAt(ax - or + 1) == str.charAt(ax + or)) {
                    or++;
                    len += 2;
                } else
                    break;
            }

            if (len > res.length()) {
                int startingIndex = ax - len / 2 + 1;
                res = str.substring(startingIndex, startingIndex + len);
            }

        }

        System.out.println(res);
        return;

    }

}
