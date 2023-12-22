import java.util.Arrays;

public class ThirdMaximumApproachTwo {

  public static int findMaxProduct(int[] nums) {
    int n = nums.length;
    Arrays.sort(nums);

    return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
  }

  public static void main(String[] args) {
    int[] nums = { -100, -98, 2, 3, 4 };
    int maxProduct = findMaxProduct(nums);

    System.out.println("Answer : " + maxProduct);
  }

}
