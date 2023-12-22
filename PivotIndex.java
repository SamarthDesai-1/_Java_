public class PivotIndex {

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };

        int total = 0;
        int prefixSum = 0;
        int pivotIndex = Integer.MIN_VALUE;

        for (int element : nums) total += element;

        for (int i = 0; i < nums.length; i++) {
            if (prefixSum == (total - prefixSum - nums[i])) {
                pivotIndex = Math.max(pivotIndex, i);
                break;
            }
            prefixSum += nums[i];
        }
        
        System.out.println(pivotIndex);

    }

}

