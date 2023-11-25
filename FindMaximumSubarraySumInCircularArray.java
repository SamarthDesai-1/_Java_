public class FindMaximumSubarraySumInCircularArray {

    private static int findMAX(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i : nums) {
            currentSum = Math.max(i, currentSum + i);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    private static int findMIN(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;

        for (int i : nums) {
            currentSum = Math.min(i, currentSum + i);
            minSum = Math.min(minSum, currentSum);
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] nums = { -5, -3, -5 };

        if (nums.length == 0)
            System.out.println("Array is empty");

        /* Condition for check if whole array is negative or not */

        boolean x = true;
        int ans = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > 0) {
                x = false;
                break;
            }
            ans = Math.max(ans, i);
        }
        if (x)
            System.out.println("Maximum of whole negative array is : " + ans);

        int maxSum = findMAX(nums);
        int minSum = findMIN(nums);

        int arraySum = 0;

        for (int i : nums) {
            arraySum += i;
        }

        int finalAns = arraySum - minSum;

        System.out.println("Final Answer : " + finalAns);
    }

}
