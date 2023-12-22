public class PrintMatrixUsingRecursion {

    public static void print(int[][] matrix, int row, int col) {

        if (row >= matrix.length || col >= matrix[0].length)
            return;

        for (int i = 0; i < matrix[row].length; i++) {
            System.out.print(matrix[i][col] + " ");
        }

        print(matrix, row + 1, col + 1);

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int row = 0;
        int col = 0;
        print(matrix, row, col);
        
    }

}
