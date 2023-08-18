package ARRAYS;

public class ReverseArray {

    public static void reverse(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int x = nums[start];
            nums[start] = nums[end];
            nums[end] = x;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        reverse(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
