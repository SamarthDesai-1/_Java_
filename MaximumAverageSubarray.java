public class MaximumAverageSubarray {

    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3, -30, 25 };
        int k = 4;
        int n = nums.length;
        int[] sum = new int[n];

        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = nums[i] + sum[i - 1];
        }
        for (int i : sum) {
            System.out.print(i + " ");
        }
    }
}
