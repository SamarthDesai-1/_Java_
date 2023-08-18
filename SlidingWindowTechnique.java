public class SlidingWindowTechnique {

    public static void main(String[] args) {
        int[] nums = { -10, -1, -2, -4 };
        int n = nums.length;
        int k = 3;
        int start = 0, end = k - 1, j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        while (end < n) {
            System.out.println(sum);
            end++;
            if (end == n) {
                break;
            } else {
                sum = sum + nums[end] - nums[j];
                max = Math.max(sum, max);
            }
            j++;
            start++;
        }

        System.out.println("Max : " + max);

    }
}
