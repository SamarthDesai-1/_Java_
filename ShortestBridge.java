import java.util.*;

public class ShortestBridge {

  static int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

  static void dfs(int[][] grid, int row, int col, boolean[][] visited, Queue<int[]> queue) {
    if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || visited[row][col] || grid[row][col] == 0) {
      return;
    }
    visited[row][col] = true;
    queue.offer(new int[] { row, col });
    for (int[] dir : directions) {
      dfs(grid, row + dir[0], col + dir[1], visited, queue);
    }
  }

  static int shortestBridge(int[][] grid) {
    int n = grid.length;
    boolean[][] visited = new boolean[n][n];
    Queue<int[]> queue = new ArrayDeque<>();

    // Find the first island and mark its cells as visited
    boolean found = false;
    for (int i = 0; i < n && !found; i++) {
      for (int j = 0; j < n && !found; j++) {
        if (grid[i][j] == 1) {
          dfs(grid, i, j, visited, queue);
          found = true;
        }
      }
    }

    // BFS to find the shortest bridge to the other island
    int minFlips = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        int[] cell = queue.poll();
        for (int[] dir : directions) {
          int newRow = cell[0] + dir[0];
          int newCol = cell[1] + dir[1];
          if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
            if (grid[newRow][newCol] == 1) {
              return minFlips; // Found the other island
            }
            visited[newRow][newCol] = true;
            queue.offer(new int[] { newRow, newCol });
          }
        }
      }
      minFlips++;
    }
    return -1; // Should not reach here if there are exactly two islands
  }

  public static void main(String[] args) {
    int[][] grid = {
        { 0, 1, 0 },
        { 0, 0, 0 },
        { 0, 0, 1 }
    };
    int n = grid.length;  
    System.out.println(shortestBridge(grid));
  }

}
