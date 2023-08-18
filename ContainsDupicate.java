public class ContainsDupicate {

    static boolean containsDupicate(int[] nums ,int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1 };
        int k = 1;
        System.out.println(containsDupicate(nums, k));
    }
}
