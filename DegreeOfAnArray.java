import java.util.HashMap;

public class DegreeOfAnArray {

    public static int degree(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i]))
                hm.put(nums[i], 1);
            else
                hm.put(nums[i], hm.get(nums[i]) + 1);
        }
        System.out.println(hm);

        int max = Integer.MIN_VALUE;
        for (int element : hm.values()) {
            max = Math.max(max, element);
        }

        int occurence = 0;
        for (int element : hm.values()) {
            if (element == max)
                occurence++;
        }

        System.out.println("Max : " + max);
        System.out.println("Max Occurence : " + occurence);

        if (occurence == 1)
            return max;

        return occurence;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1, 4, 2 };
        // int[] nums = { 1, 2, 2, 3, 1 };

        int degree = degree(nums);

        System.out.println("Degree of an Array is : " + degree);

    }

}
