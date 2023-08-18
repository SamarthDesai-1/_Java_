import java.util.HashMap;
import java.util.Stack;

public class SumOfDigitsFromString {

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

    static int getLucky(int sum, int k) {
        Stack<Integer> st = new Stack<>();
        if (k == 0 || k == 1) {
            System.out.println(sum);
        } else {
            while (sum > 0) {
                st.push(sum % 10);
                sum /= 10;
            }
            int i = 0;
            while (i < k) {
                if (st.size() == 0)
                    break;
                int size = size(st.peek());
                if (size >= 1) {
                    pushDigits(st, st.pop());
                }
                int val1 = st.pop();
                int val2 = st.pop();
                st.push(val1 + val2);
                i++;
            }
        }
        return st.peek();

    }

    public static void main(String[] args) {
        // String s = "ab";
        String s = "zbax";
        int k = 2;
        HashMap<Character, Integer> hm = new HashMap<>();
        int assigner = 1;
        for (int i = 97; i <= 122; i++) {
            char ch = (char) i;
            hm.put(ch, assigner++);
        }

        // for (var el : hm.entrySet()) {
        // System.out.print(el.getKey() + " = " + el.getValue());
        // System.out.println();
        // }

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += hm.get(s.charAt(i));
        }
        System.out.println(sum);

        // if (k == 0 || k == 1) {
        // System.out.println(sum);
        // } else {
        // Stack<Integer> st = new Stack<>();
        // while (sum > 0) {
        // st.push(sum % 10);
        // sum /= 10;
        // }
        // int i = 0;
        // while (i < k) {
        // int val1 = st.pop();
        // int val2 = st.pop();
        // st.push(val1 + val2);
        // int size = size(st.peek());
        // if (size > 1) {
        // pushDigits(st, st.pop());
        // }
        // }
        // System.out.println(st.peek());
        // }

        System.out.println(getLucky(sum, k));

    }
}
