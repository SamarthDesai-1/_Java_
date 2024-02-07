public class ReverseWordsInAStringIII {

  static String reverse(String s) {
    StringBuilder sb = new StringBuilder("");

    for (int i = s.length() - 1; i >= 0; i--) {
      sb.append(s.charAt(i));
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    String str = "Let's take LeetCode contest";

    String[] words = str.split(" ");
    StringBuilder sb = new StringBuilder("");

    for (int i = 0; i < words.length; i++) {

      String reverseString = reverse(words[i]);
      sb.append(reverseString).append(" ");

    }
    System.out.println(sb.toString().substring(0, sb.length() - 1));
  }
  
}
