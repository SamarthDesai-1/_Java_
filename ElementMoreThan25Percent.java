import java.util.*;

public class ElementMoreThan25Percent {

    public static void main(String[] args) {
        int[] nums = { 1 ,1 };
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int element : nums) {
            if (!hm.containsKey(element))
                hm.put(element, 1);
            else
                hm.put(element, hm.get(element) + 1);
        }

        for (Map.Entry<Integer, Integer> element : hm.entrySet()) {
            if (((double) element.getValue() / (double) n * 100) >= 25) {
                System.out.println(element.getKey());
                return;
            }
        }

        System.out.println(hm);
        System.out.println(((4 / n) * 100));
    }

}
