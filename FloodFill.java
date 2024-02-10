public class FloodFill {

  static void paint(int[][] grid, int color, int sr, int sc, int er, int ec) {
    if (sr < 0 || sc < 0 || sr >= grid.length || sc >= grid[0].length || grid[sr][sc] != 1)
      return;

    grid[sr][sc] = color;
    paint(grid, color, sr + 1, sc, er, ec);
    paint(grid, color, sr - 1, sc, er, ec);
    paint(grid, color, sr, sc - 1, er, ec);
    paint(grid, color, sr, sc + 1, er, ec);

  }

  public static void main(String[] args) {
    int[][] grid = {
        { 1, 1, 1 },
        { 1, 1, 0 },
        { 1, 0, 1 }
    };
    int color = 2;
    int sr = 0;
    int sc = 0;
    int er = 1;
    int ec = 1;
    paint(grid, color, sr, sc, er, ec);

    for (int[] arr : grid) {
      for (int x : arr) {
        System.out.print(x + " ");
      }
      System.out.println();
    }

  }
}
