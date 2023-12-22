public class PrefixSum {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 }; /* Prefix Sum : 1 3 6 10 15 */

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        
    }

}
