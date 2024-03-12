import java.util.*;

public class MaxFrequency {

  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2, 4, 3 };

    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (!hm.containsKey(nums[i])) {
        hm.put(nums[i], 1);
      } else {
        hm.put(nums[i], hm.get(nums[i]) + 1);
      }
    }

    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int x : hm.values()) {
      if (max <= x) {
        max = x;
        sum += x;
      }
    }

    System.out.println(sum);
    System.out.println(hm);
  }

}
