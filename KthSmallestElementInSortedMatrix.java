import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix {

  static void kthSmallest(int[][] matrix, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        pq.add(matrix[i][j]);
      }
    }

    while (k-- != 1) {
      int pop = pq.remove();
    }

    System.out.println(pq.remove());
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    int k = 8;
    kthSmallest(matrix, k);
  }

}
