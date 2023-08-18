/* Brute force */
public class SubArrays {
    static int sum = 0;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] nums = { -3, -2, -2, -3 };
        subarray(nums);
        System.out.println("Sum : " + sum);
        System.out.println("Maximum : " + max);
    }

    private static void subarray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(nums[j2] + " ");
                    sum += nums[j2];
                }
                max = Math.max(max, sum);
                sum = 0;
            }
        }
    }
}
