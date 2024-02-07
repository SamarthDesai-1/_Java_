import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrixApproach3 {

  static int kthSmallest(int[][] matrix, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (pq.size() < k)
          pq.add(matrix[i][j]);
        else {
          if (matrix[i][j] < pq.peek()) {
            pq.poll();
            pq.add(matrix[i][j]);
          }
        }
      }
    }

    return pq.peek();
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    int k = 8;
    int kthsmallest = kthSmallest(matrix, k);

    System.out.println(kthsmallest);
  }

}
