import java.util.Arrays;

public class ThirdMaximumProduct {

  public static void main(String[] args) {
    int[] nums = { -100, -98, 2, 3, 4 };
    Arrays.sort(nums);
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length - 2; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      int product = 1;

      while (left < right) {

        product = nums[i] * nums[left] * nums[right];
        left++;
        right--;
        max = Math.max(max, product);
      }
    }

    System.out.println(max);
  }

}
