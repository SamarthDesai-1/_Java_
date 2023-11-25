public class ReverseRowsIn2DArray {
    

    public static void main(String[] args) {
        
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] newMat = new int[row][col];

        reverseINDCOLS(matrix);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void reverseINDCOLS(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            reverseArray(matrix ,i);
        }
    }

    private static void reverseArray(int[][] matrix ,int i) {
        int[] nums = matrix[i];
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
