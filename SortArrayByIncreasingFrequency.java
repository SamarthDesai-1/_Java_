import java.util.HashMap;
import java.util.PriorityQueue;

public class SortArrayByIncreasingFrequency {

    public static class Sort implements Comparable<Sort> {
        int element;
        int frequency;

        Sort(int element, int frequency) {
            this.element = element;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(Sort x) {
            if (this.frequency == x.frequency)
                return x.element - this.element;

            return this.frequency - x.frequency;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        PriorityQueue<Sort> pq = new PriorityQueue<>();
        int nums[] = {
                1, 1, 2, 2, 2, 3
        };

        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            } else {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
        }

        System.out.println(hm);

        for (int i : nums) {
            pq.add(new Sort(i, hm.get(i)));
        }

        for (int i : nums) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = pq.remove().element;
        }
        System.out.println();

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

}
