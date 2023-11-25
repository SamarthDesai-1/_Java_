import java.util.*;

public class ValidTriangleNumber {

    public static void main(String[] args) {
        int[] nums = { 4, 2, 4, 3 };
        Arrays.sort(nums);
        int count = 0;
        for (int i = 2; i < nums.length; i++) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }

        System.out.println(count);
    }

}

