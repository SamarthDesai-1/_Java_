import java.util.HashMap;
import java.util.HashSet;

public class UniqueMorseCodeWords {

  static String[] codes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
      "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

  public static void main(String[] args) {
    String[] words = { "gin", "zen", "gig", "msg" };
    HashSet<String> hs = new HashSet<>();
    HashMap<Character, String> hm = new HashMap<>();

    for (int i = 97, k = 0; i <= 122; i++, k++) {
      hm.put((char) i, codes[k]);
    }

    for (int i = 0; i < words.length; i++) {

      StringBuilder sb = new StringBuilder(words[i]);

      StringBuilder ans = new StringBuilder("");
      for (int j = 0; j < sb.length(); j++) {
        ans.append(hm.get(sb.charAt(j)));
      }

      hs.add(ans.toString());
    }

    System.out.println(hs.size());
  }

}
