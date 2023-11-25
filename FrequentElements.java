import java.util.HashMap;
import java.util.Map;

public class FrequentElements {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 6, 1, 1, 2, 2, 5, 6, 3, 5 };

        Map<Integer, Integer> hm = new HashMap<>();

        for (int el : arr) {
            if (!hm.containsKey(el)) {
                hm.put(el, 1);
            } else {
                hm.put(el, hm.get(el) + 1);
            }
        }

        for (int i : hm.keySet()) {
            System.out.println(hm.get(i));
        }

        System.out.println(hm.entrySet());
    }

}
