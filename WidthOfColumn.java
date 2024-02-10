import java.util.*;

public class WidthOfColumn {

  static int digLen(int n) {
    int len = 0;
    while (n > 0) {
      int last = n % 10;
      len++;
      n /= 10;
    }

    return len;
  }

  public static void main(String[] args) {
    int[][] grid = {
        { -15, 1, 3 },
        { 15, 7, 12 },
        { 5, 6, -2 }
    };
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < grid[0].length; i++) {

      int width = 0;
      int max = Integer.MIN_VALUE;

      for (int j = 0; j < grid.length; j++) {
        if (grid[j][i] < 0)
          width = 1 + width + digLen(Math.abs(grid[j][i]));
        else
          width = width + digLen(grid[j][i]);

        max = Math.max(max, width);
        width = 0;
      }
      ans.add(max);
    }
    System.out.println(ans);
  }

}
