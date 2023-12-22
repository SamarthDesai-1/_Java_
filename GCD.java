public class GCD {

    public static int gcd(int x, int y) {

        int i = Integer.MAX_VALUE;
        i = Math.min(x, y);

        for (int j = i; j > 1; j--) {
            if (x % j == 0 && y % j == 0)
                return j;
        }

        return 1;
    }

    public static void main(String[] args) {
        int x = 8, y = 4;

        int gcd = gcd(x, y);

        System.out.println(gcd);
    }

}
