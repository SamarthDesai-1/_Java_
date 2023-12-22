import java.util.*;

public class FindWordsFormedByCharacters {


    public static void main(String[] args) {

        String[] words = { "hello", "world", "leetcode" };
        String chars = "welldonehoneyr";

        /* Think About duplicates letters too */

        /* Using hashtable we can solve this problem create hashmap of chars string */

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {
            if (!hm.containsKey(chars.charAt(i))) {
                hm.put(chars.charAt(i), 1);
            } else {
                hm.put(chars.charAt(i), hm.get(chars.charAt(i)) + 1);
            }
        }

        System.out.println("Main Chars : " + hm);

        for (int i = 0; i < words.length; i++) {
            int len = 0;
            HashMap<Character, Integer> eachWord = new HashMap<>();

            String str = words[i];

            for (int j = 0; j < str.length(); j++) {
                if (!eachWord.containsKey(str.charAt(j)))
                    eachWord.put(str.charAt(j), 1);
                else
                    eachWord.put(str.charAt(j), eachWord.get(str.charAt(j)) + 1);
            }

            System.out.println(eachWord);

            for (int j = 0; j < str.length(); j++) {
                int getValue = eachWord.get(str.charAt(j));

                if (hm.containsKey(str.charAt(j)) && hm.get(str.charAt(j)) >= getValue)
                    len++;
            }

            if (len == str.length()) {
                System.out.println(len + " " + str);
                ans += len;
            }
        }
        System.out.println(ans);

    }

    public static int ans = 0;

}
