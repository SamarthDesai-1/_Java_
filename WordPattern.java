import java.util.*;

public class WordPattern {

    public static boolean wordPattern(String pattern, String str) {
        HashMap<Character ,String> hm = new HashMap<>();
        Set<String> hs = new HashSet<>();

        String[] arr = str.split(" ");
        if (arr.length != pattern.length()) return false;

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char ch = pattern.charAt(i);

            if (hm.containsKey(ch)) {
                if (!hm.get(ch).equals(word)) return false;
            }
            else {
                if (hs.contains(word)) return false;
                else {
                    hm.put(ch, word);
                    hs.add(word);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "cat dog dog cat";

        boolean result = wordPattern(pattern, str);

        System.out.println(result);

    }
}
