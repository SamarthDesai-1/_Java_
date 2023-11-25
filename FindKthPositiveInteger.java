public class FindKthPositiveInteger {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                k++;
            } else {
                break;
            }
        }
        System.out.println(k);

    }

}
