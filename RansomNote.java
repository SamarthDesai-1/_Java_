import java.util.*;

public class RansomNote {

    public static boolean isRansomNote(String ransomNote ,String magazine) {
        Map<Character ,Integer> hm = new HashMap<>();

        /* First travel on magazine string and create hashmap of it. */

        for (int i = 0; i < magazine.length(); i++) {
            if (!hm.containsKey(magazine.charAt(i))) hm.put(magazine.charAt(i), 1);
            else hm.put(magazine.charAt(i), hm.get(magazine.charAt(i)) + 1); 
        }
       
        /* Now start traversing on ransomNote */

        int counter = 0;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (hm.containsKey(ransomNote.charAt(i))) {
                hm.put(ransomNote.charAt(i), hm.get(ransomNote.charAt(i)) - 1);
                if (hm.get(ransomNote.charAt(i)) == 0) hm.remove(ransomNote.charAt(i));
                counter++;
            } else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "ba";
        String magazine = "aab";

        boolean result = isRansomNote(ransomNote, magazine);

        System.out.println(result);
    }
    
}
