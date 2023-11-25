public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        printSpiral(matrix);
    }

    private static void printSpiral(int[][] matrix) {

        int sr = 0, er = matrix.length - 1, sc = 0, ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {

            // for row = i
            // for col = j

            // print top boundary

            for (int j = sc; j <= ec; j++) {
                System.out.print(matrix[sr][j] + " ");
            }

            // print right boundary
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec] + " ");
            }

            // print bottom boundary
            for (int j = ec - 1; j >= sc; j--) {
                System.out.print(matrix[er][j] + " ");
            }

            // print left boundary
            for (int i = er - 1; i >= sr + 1; i--) {
                System.out.print(matrix[i][sr] + " ");
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
    }
}

