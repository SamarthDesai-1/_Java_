import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] matrix = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        int row = matrix.length;
        int col = matrix[0].length;

        for (int[] array : merge(matrix)) {
            System.out.println("Row : " + array[0] + " ");
            System.out.println("Column : " + array[1] + " ");
        }

    }

    public static int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> output_arr = new ArrayList<>();

        int[] current_interval = intervals[0]; // current_interval = [1 ,3] initially add to current_interval;

        output_arr.add(current_interval); // add initially in List of array [1 ,3]

        for (int[] interval : intervals) {
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if (current_end >= next_begin) {
                current_interval[1] = Math.max(current_end, next_end);
            } else {
                current_interval = interval;
                output_arr.add(current_interval);
            }
        }

        return output_arr.toArray(new int[output_arr.size()][]);
    }
}
