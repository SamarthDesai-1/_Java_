public class MinOperationsToMakeArrayIncreasing {

  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 1 };
    int min = Integer.MAX_VALUE;
    int step = 0;
    int prev = 0;

    if (nums.length == 1) {
      System.out.println(0);
      return;
    }

    for (int i = 1; i < nums.length; i++) {
      if (nums[prev] >= nums[i]) {
        while (nums[i] <= nums[prev]) {
          nums[i]++;
          step++;
        }
        min = Math.min(min, step);
      }
      prev++;
    }
    System.out.println("Minimum required steps to make an array increasing is : " + step);
    for (int x : nums)
      System.out.print(x + " ");

  }

}
