import java.util.*;

public class IsSubsequence {

    public static void main(String[] args) {
        String s = "axe";
        String t = "xyatgxlkmkez";

        int p1 = 0 ,p2 = 0;
        int counter = 0;
        while (p1 < s.length()) {
            if (p2 < t.length() && s.charAt(p1) == t.charAt(p2)) counter++;
            else {
                while (p2 < t.length() && s.charAt(p1) != t.charAt(p2)) {
                    p2++;
                }
                if (p2 != t.length()) counter++;
            }
            p1++;
            p2++;
        }

        boolean isSubsequence = counter == s.length() ? true : false;

        System.out.println(isSubsequence);

    }
    
}
