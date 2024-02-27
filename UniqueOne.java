public class UniqueOne {

  static int Solution(int[] nums) {
    int prev = 0;
    for (int i = 1; i < nums.length; i += 2) {
      if (nums[prev] != nums[i])
        return nums[prev];

      prev += 2;
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 3, 7, 7, 10, 11, 11 };
    System.out.println(Solution(nums));
  }

}
