import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets2 {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 2 };

        int k = 2;
        int count = 0;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            int index = q.poll();
            nums[index]--;
            count++;
            if (nums[index] == 0 && index == k) {
                System.out.println(count);
                break;
            }
            if (nums[index] > 0) {
                q.add(index);
            }
        }

        System.out.println(count);

    }

}
