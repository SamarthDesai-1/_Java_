public class LeetCode2482 {

    public static int zerosROW = 0;
    public static int zerosCOL = 0;
    
    public static void find(int[][] matrix, int row, int col ,int[][] newMatrix) {

        /* LEFT */
        int ones = 0;
        for (int i = col - 1; i >= 0; i--) {
            if (matrix[row][i] == 1)
                ones++;
        }
        /* RIGHT */
        for (int i = col; i < matrix[0].length; i++) {
            if (matrix[row][i] == 1)
                ones++;
        }

        /* Calculate zeros in row based on number of ones in column */ zerosROW += matrix[0].length - ones;
        System.out.println("Ones Row : " + ones + " Zeros Row : " + zerosROW);
        int temp_ones = ones;
        int temp_zeros = zerosROW;

        ones = 0;
        zerosROW = 0;

        /* TOP */
        for (int i = row - 1; i >= 0; i--) {
            if (matrix[i][col] == 1)
                ones++;
        }
        /* BOTTOM */
        for (int i = row; i < matrix.length; i++) {
            if (matrix[i][col] == 1)
                ones++;
        }

        /* Calculate zeros in row based on number of ones in column */ zerosCOL += matrix.length - ones;
        System.out.println("Ones Column : " + ones + " Zeros Column : " + zerosCOL);
        System.out.println();

        newMatrix[row][col] = (temp_ones + ones - temp_zeros - zerosCOL);
        ones = 0;
        zerosCOL = 0;


        System.out.println("Answer");
        for (int[] arr : newMatrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 1, 1 },
            { 1, 1, 1 }
        };
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("i : " + i + " j : " + j);
                find(matrix, i, j ,newMatrix);
            }
        }
    }

}
