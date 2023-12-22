import java.util.ArrayList;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = { -1, 1, 0, -3, 3 };
        ArrayList<Integer> al = new ArrayList<>();

        int product = 1;
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j <= i - 1; j++) {
                product *= nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                product *= nums[j];
            }
            al.add(product);
            product = 1;
        }

        int[] ans = new int[al.size()];
        for (int i = 0; i < ans.length; i++) ans[i] = al.get(i);

        for (int element : ans) System.out.println(element);
        System.out.println(al);
    }

}
