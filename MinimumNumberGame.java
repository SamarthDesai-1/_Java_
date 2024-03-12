import java.util.*;

public class MinimumNumberGame {

  public static void main(String[] args) {
    int[] nums = { 2, 5 };
    Arrays.sort(nums);

    List<Integer> l = new ArrayList<>();

    for (int i = 0; i < nums.length; i += 2) {
      int alice = nums[i];
      int bob = nums[i + 1];
      l.add(bob);
      l.add(alice);
    }


    System.out.println(l);
  }

}
