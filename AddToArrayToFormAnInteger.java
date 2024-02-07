import java.util.*;

public class AddToArrayToFormAnInteger {

  static void formInteger(int[] nums, int k) {

    ArrayList<Integer> l = new ArrayList<>();

    int carry = 0;
    int indexA = nums.length - 1;
    while (indexA >= 0 || k > 0 || carry > 0) {
      int digitA = (indexA >= 0) ? nums[indexA] : 0;
      int digitK = k % 10;

      int sum = digitA + digitK + carry;
      l.add(sum % 10);

      carry = sum / 10;
      k /= 10;
      indexA--;
    }

    Collections.reverse(l);
    System.out.println(l);

  }

  public static void main(String[] args) {
    int[] nums = { 0 };
    int k = 23;

    formInteger(nums, k);

  }
}
