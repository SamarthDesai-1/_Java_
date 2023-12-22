import java.util.PriorityQueue;

public class SortThePeople {

    public static class Sort implements Comparable<Sort> {
        String name;
        int height;

        Sort(String name, int height) {
            this.name = name;
            this.height = height;
        }

        @Override
        public int compareTo(Sort x) {
            return x.height - this.height;
        }
    }

    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Bob" };
        int[] height = { 155, 185, 150 };

        PriorityQueue<Sort> pq = new PriorityQueue<>();
        for (int i = 0; i < height.length; i++) {
            pq.add(new Sort(names[i], height[i]));
        }

        for (int i = 0; i < names.length; i++) {
            String temp = pq.remove().name;
            names[i] = temp;
        }

        for (String sort : names) {
            System.out.println(sort);
        }

    }

}
