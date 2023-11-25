public class SpiralMatrix2 {

    public static void main(String[] args) {
        int n = 1;
        int[][] grid = new int[n][n];

        int top = 0, bottom = grid[0].length - 1, left = 0, right = grid[0].length - 1;

        int gridFiller = 1;

        if (grid == null || grid.length == 0) {
            return;
        }

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                grid[top][i] = gridFiller;
                gridFiller++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                grid[i][right] = gridFiller;
                gridFiller++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    grid[bottom][i] = gridFiller;
                    gridFiller++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    grid[i][left] = gridFiller;
                    gridFiller++;
                }
                left++;
            }
        }

        for (int[] arr : grid) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }

    }

}
