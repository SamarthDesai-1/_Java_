public class LongestPalindromicString {

    /* Dynamic Programming Question OR Manacher Algorithm OR Another O(n ^ 2) Algorithm is ( Axis and Orbit ) Approach */

    private static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse) ? true : false;
    }

    public static void main(String[] args) {
        String str = "12133AABBAAaaxx";

        String ans = "";
        int maxLen = Integer.MIN_VALUE;
        System.out.println(isPalindrome(str));
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {

                String extract = str.substring(i, j);
                boolean result = isPalindrome(extract);
                
                if (result == true && maxLen <= extract.length()) {
                    maxLen = Math.max(maxLen ,extract.length());
                    ans = extract;
                }


            }
        }

        System.out.println(ans);

    }

}
