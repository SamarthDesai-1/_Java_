public class MaximumTwinSum {

  public static void main(String[] args) {

    /* Typically an Linked List problem */

    int[] nums = { 5, 4, 2, 1 };
    int max = Integer.MIN_VALUE;

    int left = 0, right = nums.length - 1;

    while (left < right) {
      max = Math.max(max, (nums[left++] + nums[right--]));
    }

    System.out.println("Maximaum twin sum is : " + max);
  }

}
