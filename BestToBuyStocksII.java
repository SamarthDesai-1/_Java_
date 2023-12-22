public class BestToBuyStocksII {

    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 4, 5 };

        
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += (prices[i] - prices[i - 1]);
            }
        }

        System.out.println(maxProfit);
    }

}
