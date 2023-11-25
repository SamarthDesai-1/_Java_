import java.util.PriorityQueue;

public class BasicImplementationOfPriorityQueue {

    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 3, 1, 4, 11, 74, 0, -2, 555, 0, 2 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : nums) {
            pq.add(x);
        }

        while (pq.size() > 0) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }

    }

}
