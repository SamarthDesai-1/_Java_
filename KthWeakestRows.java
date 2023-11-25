import java.util.*;

public class KthWeakestRows {

    public static class Army implements Comparable<Army> {
        int soldiers;
        int indexes;

        Army(int soldiers, int indexes) {
            this.soldiers = soldiers;
            this.indexes = indexes;
        }

        @Override
        public int compareTo(Army y) {
            if (this.soldiers == y.soldiers) 
                return this.indexes - y.indexes;
            
            return this.soldiers - y.soldiers;
        }
    }

    private static void count(int[] rows, List<Integer> soldiers) {
        int army = 0;
        for (int x : rows) {
            if (x == 1)
                army++;
        }
        soldiers.add(army);
    }

    public static void main(String[] args) {
        PriorityQueue<Army> pq = new PriorityQueue<>();
        int[][] matrix = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
        };
        int k = 4;

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            count(matrix[i], ans);
        }

        int j = 1;
        for (int i = 0; i < ans.size(); i++) {
            if (j >= ans.size())
                break;
            if (i != j && ans.get(i) <= ans.get(j)) {
                pq.add(new Army(ans.get(i), i));
            }
            j++;
        }

        System.out.println(ans);

        int[] Array = new int[k];

        int i = 0;
        while (pq.size() > k) {
            if (pq.size() == 0) break;
            Army temp = pq.remove();
            System.out.println(temp.indexes + " " + temp.soldiers);
            Array[i++] = temp.indexes;
        }

    }

}
