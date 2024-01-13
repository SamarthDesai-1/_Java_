public class MaxConsequtiveOnes {

  public static int maxConsequtives(int[] nums) {
    if (nums.length == 1 && nums[0] == 0)
      return 0;
    else if (nums.length == 2 && nums[0] == 0 && nums[1] == 0)
      return 0;
    int left = 0;
    int right = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      while (right < nums.length && nums[right] != 0) {
        right++;
      }
      max = Math.max(max, (right - left));

      if (right < nums.length && nums[right] == 0) {
        while (right < nums.length && nums[right] != 1) {
          right++;
        }
        left = right;
      }
      i = right;
    }

    if (max == 0)
      return 1;
    return max;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 0, 0 };
    int answer = maxConsequtives(nums);

    System.out.println("Max Consequtives One's are : " + answer);
  }

}
