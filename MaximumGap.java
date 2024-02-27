import java.util.Arrays;

public class MaximumGap {

  public static void main(String[] args) {
    int[] nums = { 3, 6, 1, 9 };
    int prev = 0;
    int mg = Integer.MIN_VALUE;
    Arrays.sort(nums);

    if (nums.length < 2) {
      System.out.println(0);
      return;
    }
    
    for (int curr = 1; curr < nums.length; curr++) 
      mg = Math.max(mg, (nums[curr] - nums[prev++]));
    
    System.out.println(mg);
  }
}