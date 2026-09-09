package arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
    static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int bye = prices[0];
        for (int i = 1; i < n; i++) {
            if(prices[i] < bye){
                bye = prices[i];
            }
            else{
                int currentprofit = prices[i] - bye;
                profit = Math.max(profit, currentprofit);
            }

        }
        return profit;
    }
}
