import java.util.Arrays;

public class AfterKnegationMaxSum {

  static int Solution(int[] nums, int k) {
    for (int x : nums)
      System.out.print(x + " ");
    for (int i = 0; i < nums.length && i < k; i++) {
      if (nums[i] == 0)
        break;
      else if (nums[i] < 0) {
        nums[i] = Math.abs(nums[i]);
      } else {
        nums[i] = -nums[i];
      }
    }

    System.out.println();
    for (int x : nums)
      System.out.print(x + " ");
    System.out.println();

    int maxSum = 0;
    for (int x : nums)
      maxSum += x;

    return maxSum;
  }

  public static void main(String[] args) {
    int[] nums = { 2, -3, -1, 5, -4 };
    int k = 100;

    Arrays.sort(nums);
    System.out.println("Max sum after negations : " + Solution(nums, k));
  }

}
