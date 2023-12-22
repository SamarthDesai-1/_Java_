import java.util.Stack;

public class NextGreaterElement {

  public static void nextGreaterElement(int[] arr) {
    Stack<Integer> st = new Stack<>();

    int[] ans = new int[arr.length];
    ans[ans.length - 1] = 0;

    st.push(arr[arr.length - 1]);

    for (int i = arr.length - 2; i >= 0; i--) {

      while (st.size() > 0 && arr[i] >= st.peek())
        st.pop();

      if (st.size() == 0)
        ans[i] = 0;
      else
        ans[i] = st.peek();

      st.push(arr[i]);
    }

    for (int element : ans)
      System.out.print(element + " ");
  }

  public static void main(String[] args) {
    int[] nums = { 1, 5, 2, 9, 3, 5, 2, 2, 18 };

    nextGreaterElement(nums);

  }

}
