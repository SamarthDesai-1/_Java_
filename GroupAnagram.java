import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

        HashMap<String ,List<String>> hm = new HashMap<>();
        
        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();

            Arrays.sort(arr);

            String temp = new String(arr);
                        
            List<String> list = new ArrayList<>();
            if (!hm.containsKey(temp)) {
                list.add(words[i]);
                hm.put(temp, list);
            } else {
                List<String> cache = hm.get(temp);
                cache.add(words[i]);
                hm.put(temp, cache);
            }
            
        }
        
        List<List<String>> result = new ArrayList<>(hm.values());

        System.out.println(result);

    }

}
