import java.util.*;

public class MinusTwo {

    public static void main(String[] args) {
        // int[] nums = { -1, -2, -3 };
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] < 0) {
        //         nums[i] = Math.abs(nums[i]);
        //     }
        // }
        // Arrays.sort(nums);
        // int ans = nums[n - 1] * nums[n - 2] * nums[n - 3];
        // for (int i : nums) {
        //     System.out.println(i);
        // }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(2);
        al.add(-6);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
    }
}
