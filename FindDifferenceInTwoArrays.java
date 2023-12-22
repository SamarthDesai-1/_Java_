import java.util.*;

public class FindDifferenceInTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 3, };
        int[] nums2 = { -1, -1, 2, 2 };

        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            hs1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            hs2.add(nums2[i]);
        }

        /* Check for nums1 */ {

            List<Integer> innerList = new ArrayList<>();
            for (int x : hs1) {
                if (!hs2.contains(x)) {
                    innerList.add(x);
                }
            }
            ans.add(innerList);

        }

        /* Check for nums2 */ {

            List<Integer> innerList = new ArrayList<>();
            for (int x : hs2) {
                if (!hs1.contains(x)) {
                    innerList.add(x);
                }
            }

            ans.add(innerList);

        }

        System.out.println(ans);
    }

}
