package ARRAYS;

public class MaxInArray {

    public static int maxInArray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = Math.max(max, nums[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 5, 8, 5, 5, 5 };
        System.out.println(maxInArray(nums));
    }
}
