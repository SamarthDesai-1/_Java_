public class ProductExceptSelfApproach2 {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4};
        int[] right = new int[nums.length];

        int product = 1;

        for (int i = right.length - 1; i >= 0; i--) {
            product *= nums[i];
            right[i] = product;
        }

        product = 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < right.length - 1; i++) {
            int leftProduct = product;
            int rightProduct = right[i + 1];

            result[i] = leftProduct * rightProduct;

            product *= nums[i];
        }

        result[nums.length - 1] = product;

        for (int element : result) System.out.println(element);
    }

}
