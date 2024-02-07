import java.util.*;

public class MinimumIndexSumOfTwoLists {

  static String[] leastSum(String[] arr1, String[] arr2) {
    HashMap<String, Integer> hm1 = new HashMap<>();
    HashMap<String, Integer> hm2 = new HashMap<>();

    for (int i = 0; i < arr1.length; i++) {
      hm1.put(arr1[i], i);
    }

    int min = Integer.MAX_VALUE;
    int total = 0;

    ArrayList<String> ans = new ArrayList<>();
    for (int i = 0; i < arr2.length; i++) {
      if (hm1.containsKey(arr2[i])) {
        total = hm1.get(arr2[i]) + i;

        if (total < min) {
          ans.clear();
          ans.add(arr2[i]);
        }
        else if (total == min) {
          ans.add(arr2[i]);
        }

        min = Math.min(min, total);
      }
    }
    
    String[] arr = new String[ans.size()];

    return ans.toArray(arr);

  }

  public static void main(String[] args) {
    String[] arr1 = { "a","b","c","d","e" };
    String[] arr2 = { "b","a","e","d","c" };

    leastSum(arr1, arr2);

  }
}