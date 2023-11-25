public class TwoSumII {

    public static void main(String[] args) {

        int[] array = { 2, 7, 11, 15 };
        // int[] array = { 0, 0, 11, 15 };
        int[] ans = new int[2];
        int target = 9;

        int indexPasser = -1 ,temp = -1;
        for (int i = 0; i < array.length; i++) {

            int diff = target - array[i];
            indexPasser = i;
            boolean result = findSecond(array, ans, diff, indexPasser);
            if (result == true) {
                temp = i;
                ans[0] = temp + 1;
            }
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    private static boolean findSecond(int[] array, int[] ans, int diff, int start) {

        int temp = -1;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] == diff) {
                temp = i;
                ans[1] = temp + 1;
                return true;
            }
        }
        return false;

    }
}