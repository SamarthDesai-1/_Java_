import java.util.*;

public class RelativeRanks {

    public static String[] medal = { "Gold Medal", "Silver Medal", "Bronze Medal" };

    public static void main(String[] args) {

        int[] nums = { 10, 3, 8, 9, 4 };

        String[] ans = new String[nums.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
            pq.add(nums[i]);
        }

        int k = 1;
        int size = pq.size();
        for (int i = 0; i < size; i++) {
            int peekElem = pq.peek();
            if (k <= medal.length) {
                int index = hm.get(peekElem);
                ans[index] = medal[k - 1];
            } else {
                ans[hm.get(peekElem)] = (k + "");
            }
            pq.remove();
            k++;
        }

        for (String x : ans) {
            System.out.print(x + " ");
        }

    }

}
