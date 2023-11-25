public class KadaneEnchanceAlgorithm {

    public static void main(String[] args) {
        int[] nums = { 5, -3, 5 };

        int maxSum = Integer.MIN_VALUE; 
        int currentSum = 0;

        for (int i : nums) {
            currentSum = Math.max(i, currentSum + i);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }

}
