public class LeastTwiceElement {

  static int findMaxLeast(int[] nums) {
    int max = Integer.MIN_VALUE;
    int idx = -1;
    for (int i = 0; i < nums.length; i++) {
      if (max < nums[i]) {
        max = nums[i];
        idx = i;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != max) {
        if (max < (2 * nums[i])) {
          return -1;
        }
      }
    }
    return idx;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    int result = findMaxLeast(nums);
    System.out.println("Result : " + findMaxLeast(nums));
  }

}
