public class IncreasingTripletSubsequence {

    public static boolean isTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        int firstMIN = Integer.MAX_VALUE;
        int secondMIN = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstMIN) {
                firstMIN = num;
            } else if (num <= secondMIN) {
                secondMIN = num;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 4, 2, 1, 0, -1, -3 };

        System.out.println(isTriplet(nums));
    }

}
