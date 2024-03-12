import java.util.*;

public class BuyTwoChocolates {

  static int Solution(int[] nums, int amount) {
    for (int i = 0; i < nums.length; i++) {
      if (amount == 0)
        return 0;
      else if (nums[i] <= amount)
        amount = amount - nums[i];
    }
    return amount;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 2, 3 };
    int amount = 3;
    Arrays.sort(nums);

    System.out.println("leftover amount is : " + Solution(nums, amount));
  }

}
