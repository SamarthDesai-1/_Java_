public class MaxConsecutiveOnes3 {

  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
    int k = 2;

    int max = Integer.MIN_VALUE;
    int i = 0;
    int j = -1;

    int count = 0;

    /* Window form j + 1 to i - 1 && window size == i - 1 - j */
    while (i < nums.length) {

      /* Acquire */
      if (nums[i] == 0) {
        count++;
        i++;
      } else
        i++;

      /* Release */
      while (count > k) {
        j++;
        if (nums[j] == 0)
          count--;
      }

      /* Consider */
      int sizeOfWindow = i - j - 1;
      max = Math.max(max, sizeOfWindow);
    }

    System.out.println(max);
  }

}
