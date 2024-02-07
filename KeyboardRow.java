import java.util.*;

public class KeyboardRow {

  public static void main(String[] args) {
    String[] words = { "Hello", "Alaska", "Dad", "peace" };

    HashMap<Character, Integer> hm = new HashMap<>();
    String[] keyboard = {
        "qwertyuiop", "asdfghjkl", "zxcvbnm"
    };


    for (int i = 0; i < keyboard.length; i++) {
      String process = keyboard[i];
      for (int j = 0; j < process.length(); j++) {
        hm.put(process.charAt(j), i);
      }
    }

    
    List<String> l = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      
      String processString = words[i].toLowerCase();
      String cache = words[i];
      int p = -1;
      int c = -1;
      boolean flag = false;
      for (int j = 1; j < processString.length(); j++) {
        if (hm.containsKey(processString.charAt(j))) {
          p = hm.get(processString.charAt(j));
        }
        if (hm.containsKey(processString.charAt(j - 1))) {
          c = hm.get(processString.charAt(j - 1));
        }

        if (p != c) {
          flag = true;
          break;
        } 
      }

      if (!flag) {
        l.add(cache);
      }

    }
    System.out.println(l);
  }

}
