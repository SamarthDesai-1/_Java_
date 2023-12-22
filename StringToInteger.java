import javax.print.attribute.IntegerSyntax;

public class StringToInteger {

    public static void main(String[] args) {
        String str = "1234";
        str.trim();

        if (str.length() == 0)
            return;

        boolean negative = false;
        long ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i == 0) {
                if (ch == '-') {
                    negative = true;
                    continue;
                } else if (ch == '+') {
                    negative = false;
                    continue;
                }
            }

            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                ans = ans * 10 + digit;

                if (negative) {
                    long check = -ans;
                    if (check < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    if (ans > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                }

            } else
                break;
        }

        if (negative) {
            ans = -ans;
        }

        System.out.println((int) ans);
    }

}
