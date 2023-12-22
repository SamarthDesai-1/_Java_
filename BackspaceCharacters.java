import java.util.*;

public class BackspaceCharacters {

    public static boolean removeBackspace(String s1 ,String s2) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");

        /* Process String s1 first */
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '#') {
                if (st.isEmpty() && i < s1.length()) continue;
                else st.pop();
            }
            else st.push(s1.charAt(i));
        }
        while (st.size() > 0) sb1.append(st.pop());

        /* Process String s2 */
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == '#') {
                if (st.isEmpty() && i < s2.length()) continue;
                else st.pop();
            }
            else st.push(s2.charAt(i));
        }

        while (st.size() > 0) sb2.append(st.pop());
       
        if (sb1.toString().equals(sb2.toString())) return true;
        else if (sb1.length() == 0 && s2.length() == 0) return true;

        return false;
    }

    public static void main(String[] args) {
        String s1 = "##";
        String s2 = "#";

        boolean result = removeBackspace(s1 ,s2);

        System.out.println(result);
    }
    
}
