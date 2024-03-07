public class MaxPairs {

  static String rev(String str) {
    String revereString = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      revereString += str.charAt(i);
    }

    return revereString;
  }

  public static void main(String[] args) {
    String[] words = { "cd", "ac", "dc", "ca", "zz" };

    int pair = 0;

    for (int i = 0; i < words.length; i++) {
      String x = words[i];

      for (int j = 1; j < words.length; j++) {
        String r = rev(words[j]);

        if (i < j && x.equals(r)) {
          pair++;
        }
      }
    }

    System.out.println(pair);
  }

}
