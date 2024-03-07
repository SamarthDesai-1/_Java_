import java.util.HashSet;

public class AppendKminimalInteger {

  public static void main(String[] args) {
    int[] nums = { 5, 6 };
    int k = 6;

    HashSet<Integer> hs = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if (!hs.contains(nums[i]))
        hs.add(nums[i]);
    }

    long sum = 0;

    int oldK = k;
    k += nums.length;

    for (int i = 1; i <= k; i++) {
      if (oldK != 0 && !hs.contains(i)) {
        sum += i;
        oldK--;
      }
    }
    System.out.println("Sum : " + sum);
    System.out.println("K : " + k);
    System.out.println(hs);
  }
}
