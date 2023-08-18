import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = { -1, 0, 0, 3, 3, 3, 0, 0, 0 };
        int[] nums2 = { 1, 2, 2 };
        int n1 = nums1.length;
        int n2 = nums2.length;
        int j = 0;
        for (int i = n1 - n2; i < n1; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        ArrayList<Integer> al = new ArrayList<>(n1);
        for (int elem : nums1) {
            al.add(elem);
        }
        Collections.sort(al);
        System.out.println(al);
    }
}
