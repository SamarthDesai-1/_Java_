import java.util.*;

public class SetMatrixToZeros {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2 }, { 0, 8 } };
        int row = matrix[0].length;
        int col = matrix.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    ans.add(i);
                    ans.add(j);
                }
            }
        }
        System.out.println(ans);
        for (int i = 0; i < ans.size(); i += 2) {
            setRow(matrix, ans.get(i));
            setCol(matrix, ans.get(i + 1));
        }
        display(matrix);
    }

    private static void setCol(int[][] matrix, int col) {

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    private static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void setRow(int[][] matrix, int row) {

        int[] setRow = matrix[row];
        for (int i = 0; i < setRow.length; i++) {
            setRow[i] = 0;
        }
    }
}
