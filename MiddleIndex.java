public class MiddleIndex {

    public static int findMiddleIndex(int[] nums) {
        int mi = -1;
        int result = (nums.length / 2) + 1;
        mi = result;
        if (mi >= nums.length) {
            return mi = -1;
        }
        return mi;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 3, -1, 8, 4 };
        // int[] nums = { 1, -1, 4 };
        int[] nums = { 2, 5 };
        System.out.println(findMiddleIndex(nums));

    }
}
