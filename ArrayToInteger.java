import java.util.ArrayList;

public class ArrayToInteger {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] nums = { 9, 9, 9 };
        int n = 34;

        StringBuilder arrToStr = new StringBuilder("");
        for (int i = 0; i < nums.length; i++) {
            arrToStr.append(nums[i]);
        }
        int strToInt = Integer.parseInt(arrToStr.toString());
        int total = strToInt + n;

        int count = 0;
        while (total > 0) {
            count++;
            total /= 10;
        }

        total = strToInt + n;
        int[] ans = new int[count];
        int lastDigit = 0;
        int i = 0;
        while (total > 0) {
            lastDigit = total % 10;
            ans[i] = lastDigit;
            i++;
            total /= 10;
        }

        int start = 0, end = ans.length - 1;
        while (start <= end) {
            int x = ans[start];
            ans[start] = ans[end];
            ans[end] = x;
            start++;
            end--;
        }
        for (int elem : ans) {
            al.add(elem);
        }
        System.out.println(al);
    }
}
