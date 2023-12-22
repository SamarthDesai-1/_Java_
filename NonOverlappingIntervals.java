import java.util.*;

public class NonOverlappingIntervals {

    public static class Interval implements Comparable<Interval> {
        int[] array = null;

        Interval(int[] array) {
            this.array = array;
        }

        @Override
        public int compareTo(Interval y) {
            return this.array[1] - y.array[1];
        }
    }

    public static int intervals(int[][] array) {
        Stack<int[]> st = new Stack<>();
        st.push(array[0]);
        int remove = 0;

        for (int i = 1; i < array.length; i++) {
            int[] peek = st.peek();

            if (peek[0] <= array[i][0] && peek[1] <= array[i][0]) {
                st.push(array[i]);
            } else {
                remove++;
                continue;
            }
        }

        while (st.size() > 0) {
            int[] pop = st.pop();
            System.out.println("0th element : " + pop[0] + " " + "1th element : " + pop[1]);
        }

        if (remove >= 1)
            return remove;
        return 0;
    }

    public static void main(String[] args) {
        int[][] array = {

            { 1, 2 },
            { 2, 3 },
            { 3, 4 },
            { 1, 3 }

        };

        PriorityQueue<Interval> pq = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            pq.add(new Interval(array[i]));
        }
        for (int i = 0; i < array.length; i++) {
            Interval peek = pq.poll();
            array[i] = peek.array;
        }

        for (int[] ar : array) {
            for (int element : ar) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int ans = intervals(array);

        System.out.println("Answer : " + ans);

    }

}
