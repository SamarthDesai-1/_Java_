import java.util.*;

public class TopKFrequentElements {

    public static class Pair implements Comparable<Pair> {

        int count, num;

        Pair(int count, int num) {
            this.num = num;
            this.count = count;
        }

        public int compareTo(Pair b) {
            return this.count - b.count;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            } else {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
        }

        // for (int num : nums) {
        //     hm.put(num, hm.getOrDefault(num, 0) + 1);
        // }

        System.out.println(hm);

        Set<Integer> keys = hm.keySet();

        for (int key : keys) {
            if (pq.size() < k) {
                pq.add(new Pair(key, hm.get(key)));
            } else if (pq.peek().count < hm.get(key)) {
                pq.remove();
                pq.add(new Pair(key, hm.get(key)));
            }
        }

        int[] ans = new int[k];
        int i = k - 1;
        while (i >= 0) {
            ans[i--] = pq.remove().num;
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

}
