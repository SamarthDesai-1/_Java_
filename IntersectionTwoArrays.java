import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionTwoArrays {

    public static void main(String[] args) {
        // int[] arr1 = { 1, 2, 2, 1 };
        // int[] arr2 = { 2, 2 };
        // int[] arr1 = { 4, 9, 5 };
        // int[] arr2 = { 9, 4, 9, 8, 4 };
        int[] arr1 = {};
        int[] arr2 = {};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> al = new ArrayList<>();

        Map<Integer, Integer> hm = new HashMap<>();

        if (arr1.length == 0) {
            System.out.println(al);
            return;
        }
        if (arr2.length == 0) {
            System.out.println(al);
            return;
        }
        if (arr1.length == 0 && arr2.length == 0) {
            System.out.println(al);
            return;
        }

        if (arr2.length > 0) {

            for (int i = 0; i < arr2.length; i++) {
                int found = bs(arr1, arr2[i]);
                if (found < 0)
                    continue;
                else if (found >= 0) {
                    if (!hm.containsKey(arr2[i])) {
                        hm.put(arr2[i], 1);
                        al.add(arr2[i]);
                    }
                }
            }
            System.out.println("Intersect Elements : " + al);
            return;
        }

    }

    private static int bs(int[] arr1, int key) {

        int start = 0, end = arr1.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr1[mid] == key)
                return arr1[mid];

            if (arr1[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;

    }

}
