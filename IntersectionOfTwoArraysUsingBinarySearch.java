import java.util.*;

public class IntersectionOfTwoArraysUsingBinarySearch {

    public static int find(int element, int[] array) {

        int L = 0, R = array.length - 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (array[mid] == element)
                return array[mid];
            else if (array[mid] < element)
                L = mid + 1;
            else
                R = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 5, 4, 7, 8, 5, 9, 6, 2, 2, 5, 2, 2, 2, 2, 2, 3, 6, 6, 6, 5, 2, 2 };
        int[] nums2 = { 2, 3 };
        Set<Integer> hs = new HashSet<>();
        Arrays.sort(nums2);

        for (int i = 0; i < nums1.length; i++) {
            int element = find(nums1[i], nums2);
            if (element != -1) {
                hs.add(element);
            }
        }

        int indexFiller = 0;
        int[] ans = new int[hs.size()];
        for (int iterate : hs) {
            ans[indexFiller++] = iterate;
        }

        System.out.println(hs);
    }

}
