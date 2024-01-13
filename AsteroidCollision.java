import java.util.Stack;

public class AsteroidCollision {

  public static class Solution {

    public void collison(int[] asteroid) {
      Stack<Integer> st = new Stack<>();
      for (int stone : asteroid) {
        boolean flag = true;
        while (!st.isEmpty() && stone < 0 && st.peek() > 0) {
          if (-stone > st.peek()) st.pop();
          else if (-stone < st.peek()) {
            flag = false;
            break;
          }
          else {
            flag = false;
            st.pop();
            break;
          }
        }
        if (flag) st.push(stone);
      }

      System.out.println("Processed Stack : " + st);
    }
  }

  public static void main(String[] args) {
    int[] asteroid = { 9, 11, -7, -6, 1, 10, 100, -200, -150, -300, 1000, 1500 };

    Solution foo = new Solution();
    foo.collison(asteroid);

  }

}
