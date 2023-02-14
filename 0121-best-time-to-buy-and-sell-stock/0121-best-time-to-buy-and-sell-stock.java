class Solution {
    public int maxProfit(int[] prices) {
        int ans=0,buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            else if(ans<prices[i]-buy){
                ans=prices[i]-buy;
            }
        }
        return ans;
    }
}