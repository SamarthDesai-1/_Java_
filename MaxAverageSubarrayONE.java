public class MaxAverageSubarrayONE {

    public static void main(String[] args) {
        int[] nums = { 1, 8, 4, 2, 6, 8, 5 };
        int k = 3;

        int maxSum = 0;
        for (int i = 0; i < k; i++)
            maxSum += nums[i];

        int windowSum = maxSum;

        double ans = Double.MIN_VALUE;
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];

            double temp = (double) windowSum / (double) k;
            ans = Math.max(ans, temp);
            System.out.println(ans);
        }

        System.out.println(ans);
    }

}
