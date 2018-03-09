public class Solution{
    public int maxProfit(int[] prices){
        if(prices==null||prices.length==0)return 0;
        int profit=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(profit>prices[i])profit=prices[i];
            else max=Math.max(max,prices[i]-profit);
        }
        return max;
    }
}
