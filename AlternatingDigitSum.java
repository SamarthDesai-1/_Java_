import java.util.Stack;

public class AlternatingDigitSum {

    public static void main(String[] args) {
        // int n = 6214;
        int n = 973778881;
        Stack<Integer> st = new Stack<>();
        while (n > 0) {
            st.push(n % 10);
            n /= 10;
        }

        System.out.println("Stack : " + st);
        int track = 1;

        int size = st.size();
        while (st.size() > 1) {
            int val1 = st.pop();
            int val2 = st.pop();
            if (track % 2 == 0) {
                int ans = val1 + val2;
                st.push(ans);
            } else {
                int ans = val1 - val2;
                st.push(ans);
            }
            track++;
        }

        System.out.println(st.peek());
    }
}
