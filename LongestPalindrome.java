import java.util.HashMap;

public class LongestPalindrome {

  public static void main(String[] args) {
    String str = "abccccdd";
    
    HashMap<Character, Integer> hm = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      
      if (!hm.containsKey(str.charAt(i))) 
        hm.put(str.charAt(i), 1);
      else 
        hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
      
    }

    boolean odd = false;
    int maxLength = 0;
    for (int x : hm.values()) {
      if (x % 2 == 0) {
        maxLength += x;
      }
      else {
        odd = true;
        maxLength += x - 1;
      }
    }
    if (odd == true) {
      maxLength += 1;
    }
    
    System.out.println(maxLength);
  }
  
}
