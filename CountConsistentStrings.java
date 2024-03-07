import java.util.HashSet;

public class CountConsistentStrings {

  public static void main(String[] args) {
    String allowed = "cad";
    String[] words = { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" };
    
    HashSet<Character> hs = new HashSet<>();
    for (int i = 0; i < allowed.length(); i++) {
      hs.add(allowed.charAt(i));
    }
    System.out.println(hs);

    int count = 0;

    for (int i = 0; i < words.length; i++) {
      
      String word = words[i];
      int len = 0;

      for (int j = 0; j < word.length(); j++) {
        if (hs.contains(word.charAt(j))) {
          len++;
        }
      }
      if (len == word.length()) {
        count++;
      }
    }

    System.out.println(count);
  }

}
