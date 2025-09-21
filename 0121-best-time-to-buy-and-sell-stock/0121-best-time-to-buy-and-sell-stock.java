class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int lowest = prices[0];
        int profit = 0;
        for(int i = 0;i < n;i++){
            if(prices[i]<lowest) lowest = prices[i];
            else if(prices[i]-lowest>profit) profit = prices[i]-lowest;
        }
        return profit;
    }
}