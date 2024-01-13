public class MaxVowelsInSubstringOfGivenLength {

  public static class Vowels {
    public int getMax(String str, int k) {
      int max = Integer.MIN_VALUE;
      int left = 0;
      int right = k - 1;
      while (right < str.length()) {
        String substr = str.substring(left, right + 1);
        int vowel = 0;
        for (int i = 0; i < substr.length(); i++) {
          char ch = substr.charAt(i);

          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowel++;
          }
        }
        max = Math.max(max, vowel);
        vowel = 0;

        left++;
        right++;
      }

      return max;
    }

    public int getMaxOPT(String str, int k) {
      int start = 0;
      int max = Integer.MIN_VALUE;
      int vowels = 0;
      for (int i = 0; i < k; i++) {
        char ch = str.charAt(i);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          vowels++;
        }
      }
      max = Math.max(max, vowels);
      vowels = 0;
      System.out.println(str.substring(0, k));
      for (int i = k; i < str.length(); i++) {
        String substr = str.substring(i - k + 1, i + 1);
        for (int j = 0; j < substr.length(); j++) {
          char ch = substr.charAt(j);

          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowels++;
          }
        }
        System.out.println(substr);
        max = Math.max(max, vowels);
        vowels = 0;
      }
      return max;
    }

    public int isVowel(char ch) {
      return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;
    }

    public void getMaxVowels(String str, int k) {
      int window = 0;
      int left = 0;
      int right = 0;
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < k; i++) {
        window += isVowel(str.charAt(i));
        right = i;
      }
      right++;
      max = window;
      while (right < str.length()) {
        window -= isVowel(str.charAt(left++));
        window += isVowel(str.charAt(right++));
        max = Math.max(max, window);
      }
    }
  }

  public static void main(String[] args) {
    String s = "aeiou";
    int k = 2;

    Vowels obj = new Vowels();

    obj.getMaxVowels(s, k);

  }

}
