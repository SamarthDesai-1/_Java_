import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        Set<Integer> s = new HashSet<>();
        int maxLength = 0;

        for (int element : nums)
            s.add(element);

        for (int num : nums) {
            if (s.contains(num - 1) == false) { /* Start of a sequence */ 
                int currentNum = num;
                int currentLength = 1;

                while (s.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        System.out.println("Length of the longest consecutive sequence: " + maxLength);

    }

}
