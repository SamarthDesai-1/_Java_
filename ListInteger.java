import java.util.ArrayList;
import java.util.List;

public class ListInteger {

  public static void main(String[] args) {
    int[] nums = { 86, 2, 6, 9, 5, 7, 8 };
    List<Integer> l = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      l.add(nums[i]);
    }
    for (int i = 0; i < l.size(); i++) {
      if (l.get(i) < 10) {
        l.remove(i);
      }
    }
    System.out.println(l);
  }
}