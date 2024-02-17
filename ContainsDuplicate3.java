import java.util.Arrays;

public class ContainsDuplicate3 {

  static boolean conatins(int[] nums, int indexDiff, int valueDiff) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = 1; j < nums.length; j++) {

        if (i != j) {
          int index = Math.abs(i - j);

          if (index <= indexDiff) {

            int val = Math.abs(nums[i] - nums[j]);

            if (val <= valueDiff) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1 };
    int indexDiff = 3;
    int valueDiff = 0;

    boolean result = conatins(nums, indexDiff, valueDiff);
    System.out.println(result);
  }

}
