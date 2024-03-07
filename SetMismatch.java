import java.util.HashSet;

public class SetMismatch {

  public static void main(String[] args) {
    int[] nums = { 1, 1 };

    HashSet<Integer> hs = new HashSet<>();
    int hsSum = 0;
    int RepetetiveNumber = 0;
    int total = 0;

    int j = 1;
    for (int i = 0; i < nums.length; i++) {
      if (!hs.contains(nums[i])) {
        hsSum += nums[i];
        hs.add(nums[i]);
      } else {
        RepetetiveNumber = nums[i];
      }
      total += j++;
    }
    System.out.println(total);
    System.out.println("Repeat number : " + RepetetiveNumber + " Missing Number : " + (total - hsSum));
    System.out.println(hs);
  }

}
