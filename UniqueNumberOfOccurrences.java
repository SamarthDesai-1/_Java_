import java.util.*;

public class UniqueNumberOfOccurrences {

    public static boolean occurences(int[] nums) {
        Map<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i]))
                hm.put(nums[i], 1);
            else
                hm.put(nums[i], hm.get(nums[i]) + 1);
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (int element : hm.values()) {
            temp.add(element);
        }
        Collections.sort(temp);
        for (int i = 0; i < temp.size() - 1; i++) {
            if (temp.get(i) == temp.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 26, 2, 16, 16, 5, 5, 26, 2, 5, 20, 20, 5, 2, 20, 2, 2, 20, 2, 16, 20, 16, 17, 16, 2, 16, 20, 26, 16 };

        System.out.println(occurences(nums));

    }

}
