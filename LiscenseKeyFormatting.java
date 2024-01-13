import java.util.Stack;

public class LiscenseKeyFormatting {

  static void formatKey(String str, int k) {
    Stack<Character> st = new Stack<>();
    str = str.toUpperCase();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != '-')
        st.push(str.charAt(i));
    }

    StringBuilder sb = new StringBuilder("");
    int count = 0;
    while (st.size() > 0) {
      sb.append(st.pop());
      count++;
      if (count == k && !st.empty()) {
        count = 0;
        sb.append("-");
      }
    }
    System.out.println(sb.reverse().toString());
  }

  public static void main(String[] args) {
    String str = "5F3Z-2e-9-W";
    int k = 4;

    formatKey(str, k);
  }

}
