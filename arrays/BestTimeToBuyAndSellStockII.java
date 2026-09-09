package arrays;
//L:122
public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = new int[]{3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        int buy = prices[0];
        for(int i = 1;i < n; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else{
                int currentprofit = prices[i] - buy;
                maxprofit +=currentprofit;
                buy = prices[i];
            }
        }
        return maxprofit;
    }
}
