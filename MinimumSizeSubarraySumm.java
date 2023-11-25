import java.util.Arrays;

public class MinimumSizeSubarraySumm {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        Arrays.sort(arr);

        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int n = arr.length;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        System.out.println(minLength != Integer.MAX_VALUE ? minLength : 0);
    }

}
