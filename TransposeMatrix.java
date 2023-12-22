public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] nums = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        int[][] newMatrix = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                newMatrix[j][i] = nums[i][j];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
