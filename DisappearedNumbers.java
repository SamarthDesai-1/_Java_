import java.util.*;

public class DisappearedNumbers {

  public static void main(String[] args) {
    int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
    HashSet<Integer> hs = new HashSet<>();
    List<Integer> l = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (!hs.contains(nums[i]))
        hs.add(nums[i]);
    }

    for (int i = 1; i <= nums.length; i++) {
      if (!hs.contains(i))
        l.add(i);
    }
    System.out.println(hs);
    System.out.println("Disappeared numbers are : " + l);
  }

}
