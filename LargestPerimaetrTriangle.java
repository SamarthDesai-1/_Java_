import java.util.*;

public class LargestPerimaetrTriangle {

  static int perimater(int[] nums) {
    Arrays.sort(nums);

    for (int i = nums.length - 3; i >= 0; i--) {
      if (nums[i] + nums[i + 1] > nums[i + 2]) {
        return nums[i] + nums[i + 1] + nums[i + 2];
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 2, 3, 4 };

    int perimeter = perimater(nums);

    System.out.println(perimeter);
  }

}
