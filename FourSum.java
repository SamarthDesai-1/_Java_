import java.util.*;

public class FourSum {

    public static void main(String[] args) {
        // int[] arr = { 1, 0, -1, 0, -2, 2 };
        int[] arr = { 0, 0, 0, 0 };
        List<List<Integer>> nestedList = new ArrayList<>();

        HashMap<List<Integer>, Integer> hm = new HashMap<>();

        int target = 0;
        Arrays.sort(arr);

        int n = arr.length;
        for (int i = 0; i < n - 4; i++) {
            for (int j = i + 1; j < n - 3; j++) {

                int left = j + 1, right = arr.length - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {

                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[left]);
                        temp.add(arr[right]);

                        if (!hm.containsKey(temp)) {
                            hm.put(temp, 1);
                        } else {
                            hm.put(temp, hm.get(temp) + 1);
                        }

                    }
                    if (sum > target)
                        right--;
                    else
                        left++;
                }
            }
        }

        for (Map.Entry<List<Integer>, Integer> x : hm.entrySet()) {
            List<Integer> temp = x.getKey();
            nestedList.add(temp);
        }

        System.out.println("NestedList : " + nestedList);

    }
}
