import java.util.*;

public class MajorityElement2 {

  public static void main(String[] args) {
    int[] nums = { 3, 2, 3 };
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (!hm.containsKey(nums[i])) hm.put(nums[i], 1);
      else hm.put(nums[i], hm.get(nums[i]) + 1);
    }
    System.out.println(hm);

    List<Integer> l = new ArrayList<>();

    int maj = (nums.length / 3);
    for (Map.Entry<Integer, Integer> x : hm.entrySet()) {
      if (x.getValue() > maj) {
        l.add(x.getKey());
      }
    }
    System.out.println(l);
  }
}
