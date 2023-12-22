public class AddStrings {

    public static String addStrings(String x, String y) {

        String ans = "";
        int i = x.length() - 1;
        int j = y.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int ival = i >= 0 ? x.charAt(i) - '0' : 0;
            int jval = j >= 0 ? y.charAt(j) - '0' : 0;
            i--;
            j--;
            int sum = ival + jval + carry;
            ans = (sum % 10) + ans;
            carry = sum / 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        String x = "1145";
        String y = "4";

        String answer = addStrings(x, y);

        System.out.println("X + Y : " + answer);
    }

}
