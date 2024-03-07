import java.util.*;

public class LuckyInteger {

  public static void main(String[] args) {
    int[] nums = { 2, 2, 3, 4 };
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (!hm.containsKey(nums[i]))
        hm.put(nums[i], 1);
      else
        hm.put(nums[i], hm.get(nums[i]) + 1);
      
    }

    int max = Integer.MIN_VALUE;
    for (Map.Entry<Integer, Integer> x : hm.entrySet()) {
      if (x.getKey() == x.getValue()) {
        max = Math.max(max, x.getValue());
      }
    }

    System.out.println("Lucky integer is : " + (max == Integer.MIN_VALUE ? -1 : max));
  }

}
