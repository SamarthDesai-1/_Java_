import java.util.*;

public class LastStoneWeight {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 4, 1, 8, 1 };

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        if (nums == null) return;
        else if (nums.length == 1) {
            System.out.println(nums[i]);
            return;
        }
        
        for (int x : nums) {
            pq.add(x);
        }

        while (pq.size() > 0) {
            if (pq.size() == 1 || pq.size() == 2)
                break;
            int x = pq.remove();
            int y = pq.remove();
            if (x == y)
                continue;
            else {
                int weightDiff = x - y;
                pq.add(weightDiff);
            }

        }

        if (pq.size() == 1) {
            System.out.println(pq.remove());
            return;
        } else {
            int x = pq.remove();
            int y = pq.remove();
            if (x == y) {
                System.out.println(0);
                return;
            } else {
                System.out.println(x > y ? x - y : y - x);
                return;
            }
        } 


    }

}
