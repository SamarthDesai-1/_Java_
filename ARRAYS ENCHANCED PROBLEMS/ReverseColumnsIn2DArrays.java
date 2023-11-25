public class ReverseColumnsIn2DArrays {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            reverseINDCOL(matrix, i);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void reverseINDCOL(int[][] matrix, int col) {

        int start = 0 ,end = matrix.length - 1;
        while (start <= end) {
            int temp = matrix[start][col];
            matrix[start][col] = matrix[end][col];
            matrix[end][col] = temp;
            start++;
            end--;
        }
    }
}
