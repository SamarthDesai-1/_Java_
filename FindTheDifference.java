import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    public static void main(String[] args) {
        String s = "aaabbb";
        String t = "babxaba";

        Map<Character ,Integer> hm = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            if (!hm.containsKey(t.charAt(i))) {
                hm.put(t.charAt(i), 1);
            } else {
                hm.put(t.charAt(i), hm.get(t.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
                if (hm.get(s.charAt(i)) == 0) hm.remove(s.charAt(i));
            }
        }

        if (hm.size() == 1) {
            char ans = ' ';
            for (char x : hm.keySet()) {
                ans = x;
            }

            System.out.println(ans);
        }        
    }
    
}
