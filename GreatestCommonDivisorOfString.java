public class GreatestCommonDivisorOfString {

    public static int gcd(int x, int y) {

        int i = Integer.MAX_VALUE;
        i = Math.min(x, y);

        for (int j = i; j > 1; j--) {
            if (x % j == 0 && y % j == 0)
                return j;
        }

        return 1;
    }

    public static String commonDivisor(String s1 ,String s2) {
        if (!(s1 + s2).equals(s2 + s1)) return "";

        return s2.substring(0, gcd(s1.length(), s2.length()));
    }

    public static void main(String[] args) {
        String s1 = "LEET";
        String s2 = "CODE";

        String result = commonDivisor(s1, s2);
        System.out.println(result);

        System.out.println(gcd(s1.length(), s2.length()));

    }

}
