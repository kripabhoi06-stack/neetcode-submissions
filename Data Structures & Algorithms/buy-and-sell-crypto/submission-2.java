class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int max=0;
        while(right<prices.length){
        if(prices[left]<prices[right]){
            int profit=prices[right]-prices[left];
            if(profit>max){
            max=profit;
            }
                right++;
        }
                else{
                 left = right;
                right++;
                }
        
        
        
        }
        return max;
    }
}
