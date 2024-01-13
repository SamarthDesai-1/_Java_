import java.util.PriorityQueue;

public class KClosestPoints {

  public static class Sort implements Comparable<Sort> {
    int index;
    int distance;

    Sort(int index, int distance) {
      this.index = index;
      this.distance = distance;
    }

    @Override
    public int compareTo(Sort y) {
      return this.distance - y.distance;
    }
  }

  static void points(int[][] points, int k) {
    final int[] origin = { 0, 0 };
    PriorityQueue<Sort> pq = new PriorityQueue<>();

    for (int i = 0; i < points.length; i++) {

      int x2 = points[i][0];
      int y2 = points[i][1];

      int ans = (int) Math.sqrt(Math.pow((origin[0] - x2), 2) + Math.pow((origin[1] - y2), 2));
      pq.add(new Sort(i, ans));
    }

    int filler = 0;
    int[][] array = new int[k][2];
    while (filler < k) {
      Sort cache = pq.poll();

      for (int i = 0; i < points[cache.index].length; i++) {
        array[filler][i] = points[cache.index][i];
      }

      filler++;
    }

    for (int[] nums : array) {
      for (int element : nums) {
        System.out.print(element + " ");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    int[][] nums = {
        { 3, 3 },
        { 5, -1 },
        { -2, 4 }
    };
    int k = 2;

    points(nums, k);
  }

}
