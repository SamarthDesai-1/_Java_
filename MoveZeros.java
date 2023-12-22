import java.util.*;

public class MoveZeros {

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 0, 7, 9, 0 };
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }

        for (int element : nums)
            System.out.print(element + " ");

    }
}
