import java.util.*;

public class ImplementPriorityQueue {

    public static ArrayList<Integer> HEAP = new ArrayList<>();

    public static class Utlities {

        public void swap(int i, int j) {
            int ith = HEAP.get(i);
            int jth = HEAP.get(j);
            HEAP.set(i, jth);
            HEAP.set(j, ith);
        }

        public void upHeapify(int i) {
            if (i == 0)
                return;
            int parentIndex = (i - 1) / 2;
            if (HEAP.get(i) < HEAP.get(parentIndex)) {
                Utlities obj = new Utlities();
                obj.swap(i, parentIndex);
                upHeapify(parentIndex);
            }
        }

        public void downHeapify(int parentIndex) {
            int min = parentIndex;
            int leftChild = 2 * parentIndex + 1;
            if (leftChild < HEAP.size() && HEAP.get(leftChild) < HEAP.get(min)) {
                min = leftChild;
            }

            int rightChild = 2 * parentIndex + 2;
            if (rightChild < HEAP.size() && HEAP.get(rightChild) < HEAP.get(min)) {
                min = rightChild;
            }

            if (min != parentIndex) {
                Utlities obj = new Utlities();
                obj.swap(parentIndex, min);
                downHeapify(min);
            }
        }

    }

    public static void add(int value) {
        HEAP.add(value);
        Utlities obj = new Utlities();
        obj.upHeapify(HEAP.size() - 1);
    }

    public static int remove() {
        if (HEAP.size() == 0) {
            return -1;
        }
        Utlities x = new Utlities();
        x.swap(0, HEAP.size() - 1);
        int value = HEAP.remove(HEAP.size() - 1);
        Utlities y = new Utlities();
        y.downHeapify(0);
        return value;
    }

    public static int peek() {
        return HEAP.size() == 0 ? -1 : HEAP.get(0);
    }

    public static int size() {
        return HEAP.size();
    }

    public static boolean isEmpty() {
        return HEAP.size() == 0 ? false : true;
    }

    public static void main(String[] args) {

        int[] nums = { 1000, 2, 4, 5, 3, 78 };
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
        System.out.println(remove());
    }

}
