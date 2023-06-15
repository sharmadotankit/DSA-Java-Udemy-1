// Optimized solution

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                right++;
            } else {
                left = right;
                right++;
            }
        }
        return maxProfit;
    }
}



// Time beats 90+% space beats 10%
class Solution {
    public int maxProfit(int[] prices) {
        int leastValue = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<leastValue){
                leastValue = prices[i];
            }

            int profitIfSoldToday = prices[i]-leastValue;
            profit = Math.max(profit,profitIfSoldToday);
        }

        return profit;
    }
}