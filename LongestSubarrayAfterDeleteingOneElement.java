public class LongestSubarrayAfterDeleteingOneElement {

  public static void main(String[] args) {
    int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };

    int max = Integer.MIN_VALUE;
    int i = 0;
    int j = -1;
    int count = 0;

    while (i < nums.length) {

      if (nums[i] == 0) {
        count++;
        i++;
      } else {
        i++;
      }

      while (count > 1) {
        j++;
        if (nums[j] == 0 && j < i) {
          count--;
        }
      }

      int sizeOfWindow = i - j - 1;
      max = Math.max(max, sizeOfWindow);
    }

    System.out.println(max - 1);
  }

}
