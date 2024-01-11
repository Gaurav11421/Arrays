// leetcode 121
class Best_Time_to_Buy_and_Sell_Stock_I {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int len = prices.length;
        for(int i=0; i<len; i++){
            int cost = prices[i] - buy;
            // if(cost > profit){
            //     profit = cost;
            // }/
            profit = Math.max(cost,profit);
            // if(prices[i] > buy){
            //     buy = buy;
            // }
            // else{
            //     buy = prices[i];
            // }
            buy = Math.min(buy,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Profit: "+ maxProfit(prices));
    }
}