public class ValidPositionsInMatrix {

    public static int totalZEROS = 0;
    public static int positions = 0;

    public static void findZeros(int[][] matrix ,int row ,int col) {

        int tempRow = row;
        int tempCol = col;

        int zeros = 0;

        /* TOP */
        for (int i = row - 1; i >= 0; i--) {
            if (matrix[i][col] == 0) zeros++;
        }
        System.out.println("Zeros from top : " + zeros);
        totalZEROS += zeros;
        zeros = 0;


        /* BOTTOM */
        for (int i = row + 1; i < matrix.length; i++) {
            if (matrix[i][col] == 0) zeros++;    
        }
        System.out.println("Zeros from bottom : " + zeros);
        totalZEROS += zeros;
        zeros = 0;

        /* LEFT */
        for (int i = col - 1; i >= 0; i--) {
            if (matrix[row][i] == 0) zeros++;
        }
        System.out.println("Zeros from left : " + zeros);
        totalZEROS += zeros;
        zeros = 0;

        /* RIGHT */
        for (int i = col + 1; i < matrix[0].length; i++) {
            if (matrix[row][i] == 0) zeros++;
        }
        System.out.println("Zeros from right : " + zeros);
        totalZEROS += zeros;
        zeros = 0;
        
        /* Find positive position */
        int finalRow = matrix.length;
        int finalCol = matrix[0].length;
        int area = (finalRow + finalCol) - 1;

        if ((area - totalZEROS) == 1) {
            positions++;
            return;
        }

        System.out.println("AREA : " + area);
        System.out.println("Total ZEROS : " + totalZEROS);
        return;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 0, 0 },
            { 0, 1, 0 },
            { 0, 0, 1 }
        };

        /* Find one */
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    System.out.println("i : " + i + " j : " + j);
                    findZeros(matrix, i, j);
                    System.out.println("POSITIONS : " + positions);
                    totalZEROS = 0;
                }
            }
        }

    }

}
