import java.util.*;

public class DeleteGreatestValueInEachRow {

  static int greatestValue(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      Arrays.sort(grid[i]);
    }
    
    boolean[][] isvisited = new boolean[grid.length][grid[0].length];
    int sum = 0;
    
    for (int i = grid[0].length - 1; i >= 0; i--) {
      
      int max = Integer.MIN_VALUE;
      for (int j = 0; j < grid.length; j++) {
        if (isvisited[j][i] == true) break;        
        max = Math.max(max, grid[j][i]);
        isvisited[j][i] = true;
      }
      sum += max;
    }
    return sum;
  }

  public static void main(String[] args) {
    int[][] grid = {
        { 4, 2, 5 },
        { 9, 1, 7 },
        { 2, 1, 2 }
    };

    int val = greatestValue(grid);    

    System.out.println(val);
  }
}
