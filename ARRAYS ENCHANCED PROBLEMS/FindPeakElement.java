import java.util.*;

public class FindPeakElement {

    public static void main(String[] args) {

        // int[] array = { 1, 2, 3, 1, -3, -1, -2 };
        int[] array = { -12, -25000 };
        List<Integer> ans = new ArrayList<>();

        int n = array.length;

        if (n >= 3) {

            int prev = 0, mid = 1, next = 2;
            while (next != array.length) {
                if (array[mid] > array[prev] && array[mid] > array[next]) {
                    ans.add(mid);
                }
                prev++;
                mid++;
                next++;
            }
            System.out.println(ans);

        } else {

            if (n == 1) {
                ans.add(0);
            } else if (n == 2) {
                int prev = 0, mid = 1;
                if (array[prev] > array[mid]) {
                    ans.add(prev);
                } else {
                    ans.add(mid);
                }
            }
            System.out.println(ans);
        }

    }
}