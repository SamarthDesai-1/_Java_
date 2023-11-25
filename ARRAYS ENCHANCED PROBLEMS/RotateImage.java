public class RotateImage {

    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] newMat = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            reverseINDCOL(matrix, i);
        }

        rotate(matrix, newMat, row, col);

        copyToMain(matrix, newMat);

        display(matrix);

    }

    private static void display(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void copyToMain(int[][] matrix, int[][] newMat) {

        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[0].length; j++) {
                matrix[i][j] = newMat[i][j];
            }
            System.out.println();
        }

    }

    private static void reverseINDCOL(int[][] matrix, int col) {

        int start = 0, end = matrix.length - 1;
        while (start <= end) {
            int temp = matrix[start][col];
            matrix[start][col] = matrix[end][col];
            matrix[end][col] = temp;
            start++;
            end--;
        }
    }

    private static void rotate(int[][] matrix, int[][] newMat, int row, int col) {

        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat.length; j++) {
                newMat[j][i] = matrix[i][j];
            }
        }
    }
}