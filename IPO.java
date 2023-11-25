import java.util.*;

public class IPO {

    public static void main(String[] args) {
        int[] profits = { 1, 5, 1, 1, 1, 1, 15, 20, 30, 40 };
        int[] capital = { 0, 0, 1, 1, 2, 2, 4, 4, 5, 5 };
        int k = 4;
        int w = 0;
        
        if (profits == null || profits.length == 0) {
            System.out.println(w);
            return;
        }
        int n = profits.length;

        PriorityQueue<Integer> minCapitalQueue = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer A, Integer B) {
                return capital[A] - capital[B];
            }
        });

        PriorityQueue<Integer> maxProfitQueue = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer A, Integer B) {
                return profits[B] - profits[A];
            }
        });

        for (int i = 0; i < n; i++) {
            minCapitalQueue.add(i);
        }

        for (int i = 0; i < k; i++) {
            while (!minCapitalQueue.isEmpty() && w >= capital[minCapitalQueue.peek()]) {
                maxProfitQueue.add(minCapitalQueue.remove());
            }

            if (maxProfitQueue.isEmpty()) {
                break;
            }

            w += profits[maxProfitQueue.remove()];

            System.out.println("Capital : " + w);
        }

    }

}
