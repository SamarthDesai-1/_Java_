import java.util.Arrays;

public class CountPairsWhoseSumisLessThanTarget {

  static void Solution(int[] nums, int target) {
    Arrays.sort(nums);

    int pairs = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      int l = i + 1;
      int r = nums.length - 1;
      while (l <= r) {
        int mid = l + (r - l) / 2;

        int sum = nums[i] + nums[mid];

        if (sum < target) {
          pairs += mid - l + 1;
          l = mid + 1;
        } else
          r = mid - 1;
      }

    }

    System.out.println("Number of pairs : " + pairs);
  }

  public static void main(String[] args) {
    int[] nums = { -1, 1, 2, 3, 1 };
    int target = 2;
    Solution(nums, target);
  }

}
