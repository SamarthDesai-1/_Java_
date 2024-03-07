import java.util.*;

public class GetSmallNumbersFromCurrent {

  static int getCount(int elem, int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != elem) count++;
      else return count;
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] nums = { 8, 1, 2, 2, 3 };

    int[] newArr = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      newArr[i] = nums[i];
    }

    Arrays.sort(newArr);
    for (int i = 0; i < nums.length; i++) {
      int count = getCount(nums[i], newArr);
      nums[i] = count;
    }
    
    for (int x : nums) System.out.print(x + " ");
  }
}