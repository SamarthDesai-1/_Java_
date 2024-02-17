public class MinOperationsToMakeArrayIncreasing2 {

  public static void main(String[] args) {
    int[] nums = { 1, 1, 1 };
    int step = 0;
    final int one = 1;

    int prev = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[prev] >= nums[i]) {
        int diff = nums[prev] - nums[i];
        nums[i] = diff + nums[i] + one;
        step = step + diff + one;
      }
      prev++;
    }
    System.out.println("Minimum required steps to make an array increasing is : " + step);
  }
}
