import java.util.*;

public class AllSum {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    Arrays.sort(nums);

    int max = nums[nums.length - 1] + nums[nums.length - 2];
    int min = nums[0] + nums[1];

    System.out.println(max);
    System.out.println(min);
  }

}
