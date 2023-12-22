import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualToK {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;

        int sum = 0;
        int result = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (hm.containsKey(sum - k)) {
                result += hm.get(sum - k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        System.out.println(result);
    }

}
