package arrays;
//L122
public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int n =  prices.length;
        int maxProfit = 0;;
        int buy = prices[0];;
        for (int i = 1; i < n; i++) {
            if(prices[i] < buy) {
                buy = prices[i];
            }
            else{
                int currentprofit = prices[i] - buy;
                maxProfit +=  currentprofit;
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}
