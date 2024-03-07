import java.util.HashSet;

public class MaxPairsApproach {

  public static void main(String[] args) {
    String[] words = { "cd", "ac", "dc", "ca", "zz" };

    int pair = 0;

    HashSet<String> hs = new HashSet<>();

    for (int i = 0; i < words.length; i++) {
      if (hs.contains(new StringBuilder(words[i]).reverse().toString())) 
        pair++;
      
      else 
        hs.add(words[i]);
      
    }

    System.out.println(pair);
  }
  
}
