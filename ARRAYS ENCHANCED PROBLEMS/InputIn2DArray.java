import java.util.*;

public class InputIn2DArray {

    public static Scanner foo = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner foo = new Scanner(System.in);

        System.out.print("Enter Row : ");
        int row = foo.nextInt();
        System.out.print("Enter Column : ");
        int col = foo.nextInt();
        System.out.println();

        constructMatrix(row, col);

    }

    private static void constructMatrix(int row, int col) {

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Value : ");
                int value = foo.nextInt();
                matrix[i][j] = value;
            }
            System.out.println();
        }

        display(matrix, row, col);
    }

    private static void display(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
