import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    int[] ans = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int partner = target - nums[i];
      if (mp.containsKey(partner)) {
        ans[1] = i;
        ans[0] = mp.get(partner);
        return ans;
      }
      mp.put(nums[i], i);
    }
    return ans;

  }

  public static void main(String[] args) {
    int[] nums = { 3, 2, 4 };
    int target = 6;

    for (int indexes : twoSum(nums, target))
      System.out.print(indexes + " ");
  }

}
