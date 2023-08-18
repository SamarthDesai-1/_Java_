import java.util.*;

public class CanMakeArthimethicProgression {

    public static boolean canMakeArithmeticProgression(int[] arr) {
        int diff = 0;
        Arrays.sort(arr);
        diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == diff) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, -2, 4 };
        System.out.println(canMakeArithmeticProgression(nums));
    }
}
