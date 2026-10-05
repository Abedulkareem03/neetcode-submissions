class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // best buy price seen so far
            if (price < minPrice) minPrice = price;

            // best profit if we sell today
            int profitToday = price - minPrice;
            if (profitToday > maxProfit) maxProfit = profitToday;
        }
        return maxProfit;
    }
}