import java.util.HashMap;

public class LargestSubstringBetweenTwoEqualCharacters {

  static int longestSubstring(String str) {
    int max = Integer.MIN_VALUE;

    HashMap<Character ,Integer> hm = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      if (!hm.containsKey(str.charAt(i))) hm.put(str.charAt(i), i);
      else {
        int oldIndex = hm.get(str.charAt(i));
        max = Math.max(max, i - oldIndex - 1);
      }
    }
    return max == Integer.MIN_VALUE ? -1 : max;
  }

  public static void main(String[] args) {
    String str = "mgntdygtxrvxjnwksqhxuxtrv";

    int length = longestSubstring(str);

    System.out.println("Max length substring between two equal characters is : " + length);
  }
  
}
