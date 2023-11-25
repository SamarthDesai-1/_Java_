import java.util.*;

public class FourSumUsingHashSet {

    public static void main(String[] args) {
        // int[] arr = { 1, 0, -1, 0, -2, 2 };
        int[] arr = { 1000000000,1000000000,1000000000,1000000000 };
        List<List<Long>> nestedList = new ArrayList<>();

        HashSet<List<Long>> hs = new HashSet<>();

        int target = -294967296;
        Arrays.sort(arr);

        int n = arr.length;
        for (int i = 0; i < n - 3; i++) {     
            if (i > 0 && arr[i] == arr[i - 1]) continue;       
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;       
                int left = j + 1, right = arr.length - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {

                        List<Long> temp = new ArrayList<>();
                        temp.add((long)arr[i]);
                        temp.add((long)arr[j]);
                        temp.add((long)arr[left]);
                        temp.add((long)arr[right]);

                        hs.add(temp);
                    }
                    if (sum > target)
                        right--;
                    else
                        left++;
                }
            }
        }


        for (List<Long> list : hs) {
            nestedList.add(list);
        }

        System.out.println(nestedList);
    }

}
