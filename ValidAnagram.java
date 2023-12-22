import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        /* Create hashmap of string s */

        HashMap<Character ,Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (!hm.containsKey(ch)) hm.put(ch, 1);
            else hm.put(ch, hm.get(ch) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!hm.containsKey(t.charAt(i))) return false;
            else if (hm.get(t.charAt(i)) == 1) hm.remove(t.charAt(i));
            else hm.put(t.charAt(i), hm.get(t.charAt(i)) - 1);
        }
        
        return hm.size() == 0 ? true : false;
    }

    public static void main(String[] args) {
        String s = "samarth";
        String t = "mraaths";

        boolean result = isAnagram(s, t);

        System.out.println(result);

    }

}
