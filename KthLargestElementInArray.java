import java.util.*;

public class KthLargestElementInArray {

    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 3, 1, 4, 11, 74, 0, -2, 555, 0, 2 };
        int k = 3;
        List<Integer> elements = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x = 0; x < nums.length; x++) {
            if (x < k) {
                pq.add(nums[x]);
            } else {
                if (nums[x] > pq.peek()) {
                    pq.remove();
                    pq.add(nums[x]);
                }
            }
        }

        while (k-- != 0) {
            elements.add(pq.peek());
            pq.remove();
        }

        System.out.println(elements);
    }

}

