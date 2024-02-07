import java.util.Arrays;

public class KthSmallestElementInSortedMatrixApproach2 {

  static int kthSmallest(int[][] matrix, int k) {
    int n = matrix.length;
    int[] nums = new int[n * n];

    int idx = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        nums[idx++] = matrix[i][j];
      }
    }

    Arrays.sort(nums);

    return nums[k - 1];
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
