import java.util.Stack;

public class AddDigits {

    static void pushDigits(Stack<Integer> st, int n) {
        while (n > 0) {
            st.push(n % 10);
            n /= 10;
        }
    }

    static int size(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // int n = 38;
        // int n = 612;
        // int n = 99;
        int n = 290029978;
        while (n > 0) {
            st.push(n % 10);
            n /= 10;
        }
        while (st.size() > 1) {
            int val1 = st.pop();
            int val2 = st.pop();
            st.push(val1 + val2);

            int size = size(st.peek());
            if (size > 1) {
                pushDigits(st, st.pop());
            }
        }
        System.out.println(st.peek());

    }
}
