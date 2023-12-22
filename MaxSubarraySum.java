import java.util.ArrayList;

public class MaxSubarraySum {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        ArrayList<Double> al = new ArrayList<>();
        int k = 3;

        int maxSum = 0;
        for (int i = 0; i < k; i++)
            maxSum += nums[i];

        int windowSum = maxSum;
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum + nums[i] - nums[i - k];
            al.add((double) windowSum / (double) k);
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);

        System.out.println(al);
    }

}
