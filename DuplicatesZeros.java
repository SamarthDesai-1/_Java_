public class DuplicatesZeros {

  public static void main(String[] args) {
    int[] nums = { 1,2,3,4,5,6 };

    int[] result = new int[nums.length];
    int itr = 0;
    for (int i = 0; i < nums.length; i++) {
      if (itr < nums.length && nums[i] == 0) {
        result[itr + 1] = 0;
        itr += 2;
      }
      else {
        if (itr < nums.length)
          result[itr] = nums[i];
          itr++;
      }
    }

    for (int x : result) System.out.print(x + " ");
  }
}