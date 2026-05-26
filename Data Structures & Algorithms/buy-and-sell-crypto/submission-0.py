class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        min_cost = prices[0]
        max_profit=0
        sell=0
        for i in range(1,len(prices),1):
    
            if min_cost>prices[i]:
                min_cost=prices[i]
                continue
            
            sell = prices[i]-min_cost

            if sell>max_profit:
                max_profit=sell
        
        return max_profit
            
        