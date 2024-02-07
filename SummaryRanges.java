import java.util.*;

public class SummaryRanges {

  static List<String> range(int[] nums) {
    List<String> l = new ArrayList<>();
    if (nums.length == 0) return l;
    if (nums.length == 1) {
      l.add(nums[0] + "");
      return l;
    }

    int a = nums[0];
    int b = nums[0];
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1] + 1) {
        b = nums[i];
        count++;
      }
      else {
        StringBuilder sb = new StringBuilder("");
        if (count == 1) {
          sb.append(a);
        }
        else {
          sb.append(a + "->" + b);
        }
        l.add(sb.toString());
        a = nums[i];
        b = nums[i];
        count = 1;
      }
    }

    StringBuilder temp = new StringBuilder("");
    if (count == 1) {
      temp.append(a);
    }
    else {
      temp.append(a + "->" + b);
      l.add(temp.toString());
    }

    System.out.println(l);
    return l;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 2, 3, 4, 6, 8, 9 };
    range(nums);
  }

}
