import java.util.*;

public class FindCommonCharacters {

  static class Solution {

    static List<String> findCommonCharacters(String[] words) {

      List<String> ans = new ArrayList<>();
      int[] common = new int[26];
      Arrays.fill(common, Integer.MAX_VALUE);

      for (String word : words) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
          count[c - 'a']++;
        }

        for (int i = 0; i < 26; i++)
          common[i] = Math.min(common[i], count[i]);

      }

      for (int i = 0; i < 26; i++)
        for (int j = 0; j < common[i]; j++)
          if (common[i] > 0)
            ans.add("" + (char) ('a' + i));

      return ans;
    }
  }

  public static void main(String[] args) {
    String[] arr = { "bella", "label", "roller", "espanoll" };
    Solution foo = new Solution();

    List<String> ans = foo.findCommonCharacters(arr);

    System.out.println("Uncommon Characters : " + ans);
  }

}
