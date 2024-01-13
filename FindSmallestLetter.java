public class FindSmallestLetter {

  static char approach(char[] nums, char target) {
    int previous = 0;
    int current = previous + 1;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[previous] <= target && nums[current] > target) {
        return nums[current];
      }
      previous++;
      current++;
    }

    return nums[0];

  }

  public static void main(String[] args) {
    char[] nums = { 'b', 's', 'u', 'w', 'x', 'y', 'z' };
    char target = 'v';

    System.out.println(approach(nums, target));

  }

}
