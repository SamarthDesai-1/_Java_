import java.util.*;

public class MostFrequentEvenElement {

    public static class Sort implements Comparable<Sort> {
        int val;
        int frequency;

        Sort(int val, int frequency) {
            this.val = val;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(Sort x) {
            if (this.frequency == x.frequency)
                return this.val - x.val;
            return x.frequency - this.frequency;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 29, 47, 21, 41, 13, 37, 25, 7 };

        PriorityQueue<Sort> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (!hm.containsKey(nums[i])) {
                    hm.put(nums[i], 1);
                } else {
                    hm.put(nums[i], hm.get(nums[i]) + 1);
                }
            }
        }
        System.out.println(hm);

        for (Map.Entry<Integer, Integer> x : hm.entrySet()) {
            pq.add(new Sort(x.getKey(), x.getValue()));
        }

        if (!pq.isEmpty()) {
            while (pq.size() > 0) {
                System.out.println(pq.peek().val + " " + pq.peek().frequency);
                pq.remove();
            }
        } else {
            System.out.println(-1);
        }
    }

}
