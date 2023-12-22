import java.util.*;

public class DailyTemperatures {

  public static void nextGreaterElement(int[] arr) {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> index = new Stack<>();

    int[] ans = new int[arr.length];
    st.push(arr[arr.length - 1]);
    index.push(arr.length - 1);

    ans[arr.length - 1] = 0;

    for (int i = arr.length - 2; i >= 0; i--) {
      while (st.size() > 0 && arr[i] >= st.peek()) {
        st.pop();
        index.pop();
      }

      if (st.size() == 0)
        ans[i] = 0;
      else {
        ans[i] = index.peek() - i;
      }

      st.push(arr[i]);
      index.push(i);
    }

    for (int element : ans)
      System.out.print(element + " ");

  }

  public static void main(String[] args) {
    int[] nums = { 30, 60, 90 };

    nextGreaterElement(nums);

  }

}
