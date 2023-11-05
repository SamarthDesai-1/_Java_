import java.util.Arrays;

public class FindDuplicateNumberApproachOne {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };

        int index = -1;

        Arrays.sort(arr);

        int ptr1 = 0, ptr2 = ptr1 + 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[ptr1] == arr[ptr2]) {
                index = ptr1; // index = ptr2;
                break;
            }
            ptr1++;
            ptr2++;
        }

        System.out.println("Duplicate : " + arr[index]);
    }
}
