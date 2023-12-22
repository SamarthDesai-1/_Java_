import java.util.*;

public class RemoveStarsFromString {

    public static void main(String[] args) {
        String str = "leet**cod*e";
        StringBuilder sb = new StringBuilder("");
        
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (st.isEmpty() && i < str.length()) continue;
                else st.pop();
            }
            else st.push(str.charAt(i));
        }

        while (st.size() > 0) sb.append(st.pop());
        
        System.out.println(sb.reverse().toString());
    }
    
}
