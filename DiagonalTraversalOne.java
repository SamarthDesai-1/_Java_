import java.util.ArrayList;

public class DiagonalTraversalOne {

  static void traversal(int[][] mat) {
    ArrayList<Integer> l = new ArrayList<>();
    int rows = mat.length;
    int cols = mat[0].length;

    for (int i = 0; i < rows + cols - 1; i++) {
      int start_row = Math.min(i, rows - 1);
      int start_col = Math.max(0, i - rows + 1);
      int end_row = Math.max(0, i - cols + 1);
      int end_col = Math.min(i, cols - 1);
      if (i % 2 == 0) {
        
        /* Diagonal up traversal */
        
        for (int row = start_row, col = start_col; row >= end_row && col <= end_col; row--, col++) {
          l.add(mat[row][col]);
        }
      } else {
        
        /* Diagonal down traversal */
        
        for (int row = end_row, col = end_col; row <= start_row && col >= start_col; row++, col--) {
          l.add(mat[row][col]);
        }
      }
    }
    System.out.println(l);
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    traversal(matrix);
  }
}
