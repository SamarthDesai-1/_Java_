public class LinearSearch {

    public static int LS(int[] nums, int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 52, 63, 9, 4, 2, 5, 8, 6, 3, 9, 99, 5 };
        int key = 8;

        System.out.println(LS(nums, key));

    }
}