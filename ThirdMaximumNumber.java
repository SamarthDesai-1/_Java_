import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 7, -7, 3, 5, 9, 6 };

        Set<Integer> hs = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : arr) {
            if (hs.contains(x)) {
                continue;
            } else {
                hs.add(x);
            }

            if (pq.size() == 3) {
                if (pq.peek() < x) {
                    pq.poll();
                    pq.add(x);
                }
            } else {
                pq.add(x);
            }
        }

        if (pq.size() == 3) {
            System.out.println(pq.poll());
            return;
        } else {
            int max = pq.poll();
            while (!pq.isEmpty()) {
                max = pq.poll();
            }
            System.out.println(max);
            return;
        }

    }

}
