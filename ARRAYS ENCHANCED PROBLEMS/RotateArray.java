public class RotateArray {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        int k = 2;
        rotateArray(nums, k);
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    private static void rotateArray(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k == 0) {
            return;
        }
        k %= nums.length; // when k is greater than array length
        reverse(nums, 0, nums.length - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, nums.length - 1);

    }

    private static void reverse(int[] nums, int start, int end) {

        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
