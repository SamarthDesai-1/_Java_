public class KadaneAlgorithm {

    public static void main(String[] args) {
        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int ms = nums[0];
        int cs = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            cs += nums[i];
            ms = Math.min(ms, cs);
            if (cs < 0)
                cs = 0;
        }
        System.out.println(ms);
    }
}
