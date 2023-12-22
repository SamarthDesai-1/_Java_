import java.util.*;

public class NDoubleExists {

  public static boolean isExists(int[] nums) {
    HashSet<Integer> hs = new HashSet<>();

    System.out.println(hs);
    for (int i = 0; i < nums.length; i++) {
      if (hs.contains(nums[i] * 2) || nums[i] % 2 == 0 && hs.contains(nums[i] / 2))
        return true;

      hs.add(nums[i]);
    }

    return false;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 0 };
    boolean isExists = isExists(nums);

    System.out.println(isExists);
  }

}
