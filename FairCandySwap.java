import java.util.ArrayList;

public class FairCandySwap {

    public static void main(String[] args) {
        int[] alice = { 1, 1 };
        int[] bob = { 2, 2 };
        ArrayList<Integer> al = new ArrayList<>();

        int asumf = 0, bsumf = 0;
        for (int i : alice) {
            asumf += i;
        }
        for (int i : bob) {
            bsumf += i;
        }

        for (int i = 0; i < alice.length; i++) {
            int asum = asumf - alice[i];
            int bsum = bsumf + alice[i];
            int v = (bsum - asum) / 2;
            int index = bs(bob, v);
            if (index != -1) {
                al.add(alice[i]);
                al.add(bob[index]);
                return;
            }
        }

        System.out.println(al);
    }

    private static int bs(int[] arr, int i) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == i)
                return mid;
            else if (arr[mid] < i)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

}
