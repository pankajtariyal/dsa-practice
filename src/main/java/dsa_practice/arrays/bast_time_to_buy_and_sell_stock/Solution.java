package dsa_practice.arrays.bast_time_to_buy_and_sell_stock;

public class Solution {

    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;

        int basePrice = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            int p = prices[i];
            if(p<basePrice){
                basePrice = p;
            }else {
                if(profit<(p - basePrice)){
                    profit = p-basePrice;
                }
            }
        }
        return profit;
    }
}
