import java.util.*;

public class FlippingAnImage {

  static void reverse(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }
  }

  static int[][] flip(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {

      reverse(grid[i]);

      for (int j = 0; j < grid.length; j++) {
        if (grid[i][j] == 0)
          grid[i][j] = 1;
        else
          grid[i][j] = 0;
      }
    }
    return grid;
  }

  public static void main(String[] args) {
    int[][] grid = {
        { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 }
    };
  }
}
