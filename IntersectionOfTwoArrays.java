import java.util.*;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };

        List<Integer> ans = new ArrayList<>();

        Set<Integer> h1 = new HashSet<>();
        Set<Integer> h2 = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : nums1) {
            h1.add(x);
        }

        for (int x : nums2) {
            h2.add(x);
        }

        for (int x : h1) {
            if (!hm.containsKey(x)) {
                hm.put(x, 1);
            } else {
                hm.put(x, hm.get(x) + 1);
            }
        }

        for (int x : h2) {
            if (hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> x : hm.entrySet()) {
            if (x.getValue() > 1) {
                ans.add(x.getKey());
            }
        }

        int[] result = new int[ans.size()];

        int i = 0;
        for (int x : ans) {
            result[i] = x;
            i++;
        }

    }

}
