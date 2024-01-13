import java.util.Arrays;

public class KsumPairs {

  public static int kSumPairs(int[] nums, int k) {
    Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;
    int remove = 0;
    while (left < right) {
      int sum = nums[left] + nums[right];
      if (sum == k) {
        nums[left++] = nums[right--] = 0;
        remove++;
      } else if (sum < k)
        left++;
      else
        right--;
    }

    return remove;
  }

  public static void main(String[] args) {
    int[] nums = { 1 };
    int k = 1;

    int answer = kSumPairs(nums, k);
    System.out.println("Answer : " + answer);

  }

}

