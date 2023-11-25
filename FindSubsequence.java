import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class FindSubsequence {

    
    public static void main(String[] args) {
        int[] nums = { 3, 4, 3, 3 };
        int k = 2;

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> (a[0] - b[0]));

        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[] { nums[i], i });
            if (pq.size() > k) {
                pq.remove();
            }
        }

        Set<Integer> index = new HashSet<>();
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            index.add(top[1]);
        }

        int[] ans = new int[k];
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (index.contains(i)) {
                ans[p++] = nums[i];
            }
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

}
