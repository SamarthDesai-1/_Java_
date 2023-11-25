import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    private static int findFirstUnique(String str) {
        HashMap<Character ,Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), 1);
            } else {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "aabb";

        int result = findFirstUnique(str);
        System.out.println(result);
    }
    
}


