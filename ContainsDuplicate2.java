import java.util.HashMap;

public class ContainsDuplicate2 {

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 1, 4, 5, 6, 1, 1 };
        // int[] arr = { 1,0,1,1 };
        int[] arr = { 1, 2, 3, 1, 2, 3 };
        int k = 2;

        System.out.println(findDuplicate(arr, k));
    }

    private static boolean findDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], i);
            } else {
                if (i - mp.get(arr[i]) <= k) {
                    return true;
                }
                mp.put(arr[i], i);
            }
        }
        return false;
    }

}
