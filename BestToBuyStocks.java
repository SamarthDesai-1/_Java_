public class BestToBuyStocks {

    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < nums.length; i++) {
            if (buyPrice < nums[i]) {
                int profit = nums[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = nums[i];
            }
        }
        System.out.println(maxProfit);
    }

}
