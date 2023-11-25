import java.util.*;

public class MergeIntervalApproachTwo {

    public static void main(String[] args) {

        int[][] matrix = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        Pair[] pairs = new Pair[matrix.length];
        for (int i = 0; i < pairs.length; i++) {
            pairs[i] = new Pair(matrix[i][0], matrix[i][1]);
        }

        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < pairs.length; i++) {
            if (i == 0) {
                st.push(pairs[i]);
            } else {
                Pair top = st.peek();
                if (pairs[i].start > top.end) {
                    st.push(pairs[i]);
                } else {
                    top.end = Math.max(top.end, pairs[i].end);
                }
            }
        }

        Stack<Pair> res = new Stack<>();
        while (st.size() > 0) {
            res.push(st.pop());
        }

        List<int[]> output = new ArrayList<>();

        while (res.size() > 0) {
            Pair top = res.pop();
            int start = top.start;
            int end = top.end;
            int[] temp = new int[2];
            temp[0] = start;
            temp[1] = end;
            output.add(temp);
        }

        for (int[] is : output) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
        }
                // OR
        // return output.toArray(new int[output.size()][]);
    }

    public static class Pair implements Comparable<Pair> {
        int start, end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        // this > other return positive+
        // this < other return negative-
        // this == other return 0

        public int compareTo(Pair other) {

            if (this.start != other.start) {
                return this.start - other.start;
            } else {
                return this.end - other.end;
            }
        }

    }
}