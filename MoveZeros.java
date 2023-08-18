public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        int n = nums.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = 0; i < ans.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                ans[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
