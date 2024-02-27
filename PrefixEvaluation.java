import java.util.Stack;

public class PrefixEvaluation {

    public static void main(String[] args) {
        String prefix = "-9/*+5346"; // 4

        Stack<Integer> val = new Stack<>();

        char ch = ' ';
        for (int i = prefix.length() - 1; i >= 0; i--) {
            ch = prefix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else {
                int v1 = val.pop();
                int v2 = val.pop();
                if (ch == '+')
                    val.push(v1 + v2);
                if (ch == '-')
                    val.push(v1 - v2);
                if (ch == '*')
                    val.push(v1 * v2);
                if (ch == '/')
                    val.push(v1 / v2);
            }
        }
        System.out.println(val.peek());
    }
}
