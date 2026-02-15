package dsa_practice.arrays.bast_time_to_buy_and_sell_stock;

public class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution solution = new Solution();
        int profit = solution.maxProfit(prices);
        System.out.println(profit);
    }
}
