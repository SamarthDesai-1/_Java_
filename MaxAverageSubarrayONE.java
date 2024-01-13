public class MaxAverageSubarrayONE {

    public static double avg(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];

        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 7, 3, 5, 6, 2, 0, 8, 1, 9 };
        int k = 6;
        System.out.println(avg(nums, k));
    }

}