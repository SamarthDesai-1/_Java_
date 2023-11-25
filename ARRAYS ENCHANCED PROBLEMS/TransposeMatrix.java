public class TransposeMatrix {

    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] newMat = new int[row][col];

        transpose(matrix, newMat);

        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[0].length; j++) {
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void transpose(int[][] matrix, int[][] newMat) {

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMat[j][i] = matrix[i][j];
            }
        }

    }
}
