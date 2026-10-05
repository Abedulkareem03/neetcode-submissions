class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int afterIthDay = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) { //after this loop 
            if (prices[i] < minVal) {             // we will have minimum value and idx
                minVal = prices[i];
                afterIthDay = i + 1;
            }
            for (int j = afterIthDay; j < prices.length; j++) {
                if (prices[j] > minVal) {
                     int currentDifference = prices[j] - minVal;
                     if (currentDifference > maxProfit) {
                         maxProfit = currentDifference;
                     }
                } 
            }
        }
    return maxProfit;
    }
}
