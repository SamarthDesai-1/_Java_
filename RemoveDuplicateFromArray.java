import java.util.ArrayList;

public class RemoveDuplicateFromArray {

  
  public static void main(String[] args) {
    int[] nums = { 0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 3, 3 };
    ArrayList<Integer> l = new ArrayList<>();
    int p = 0;
    int c = 0;

    while (c < nums.length) {

      while (c < nums.length - 1 && nums[c] == nums[c + 1]) {
        c++;
      }
      p = p + (c - p) - 1;
      if (nums[p] == nums[c]) {
        l.add(nums[p]);
        l.add(nums[c]);
      } else {
        l.add(nums[c]);
      }
      c++;
      p = c;
    }
    System.out.println(l);

  }
}