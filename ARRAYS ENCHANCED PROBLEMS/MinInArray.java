public class MinInArray {

    public static void main(String[] args) {
        int[] nums = { 5, 1, 3, 4, 2 };
        System.out.println(findMIN(nums));
    }

    private static int findMIN(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}

