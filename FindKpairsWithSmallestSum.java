import java.util.*;

public class FindKpairsWithSmallestSum {

  static class Pair implements Comparable<Pair> {
    int x = 0;
    int y = 0;
    int sum = 0;

    Pair(int x, int y, int sum) {
      this.x = x;
      this.y = y;
      this.sum = sum;
    }

    @Override
    public int compareTo(Pair y) {
      return this.sum - y.sum;
    }
  }

  static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
    
    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length; j++) {

        int sum = nums1[i] + nums2[j];
        
        if (pq.size() < k) {
          pq.add(new Pair(nums1[i], nums2[j], sum));
        } 
        else if (pq.peek().sum > sum) {
          pq.remove();
          pq.add(new Pair(nums1[i], nums2[j], sum));
        } 
        else {
          break;
        }
      }
    }
    
    List<List<Integer>> list = new ArrayList<>();
    while (pq.size() > 0) {
      List<Integer> newList = new ArrayList<>();
      Pair cache = pq.remove();
      newList.add(cache.x);
      newList.add(cache.y);
      list.add(newList);
    }

    return list;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 1, 2 };
    int[] nums2 = { 1, 2, 3 };
    int k = 2;

    List<List<Integer>> ans = kSmallestPairs(nums1, nums2, k);
    System.out.println(ans);
  }

}
