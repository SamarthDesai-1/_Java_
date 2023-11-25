public class PrintAllSubArrays {
    
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12,14};

        getSUBARRAYS(nums);
        System.out.println();
        System.out.println("Max Subarray Sum : " + getMAXSUBARRAYSUM(nums));
        System.out.println("Min Subarray Sum : " + getMINSUBARRAYSUM(nums));
        
    }

    private static int getMINSUBARRAYSUM(int[] nums) {
        return nums[0];
    }

    private static int getMAXSUBARRAYSUM(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    private static void getSUBARRAYS(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print("(" + nums[k] + ")");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
