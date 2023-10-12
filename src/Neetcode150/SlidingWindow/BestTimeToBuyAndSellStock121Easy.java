package Neetcode150.SlidingWindow;

/**
 * @author umeshkhatiwada13
 * @project Leetcode
 * @created 10/10/2023 - 23:20
 */
public class BestTimeToBuyAndSellStock121Easy {
    public static int maxProfit1(int[] prices) {
        int maxProfit = 0;  // Initialize the maximum profit to 0.
        int leftPointer = 0;  // Initialize the left pointer to the start of the array.
        int rightPointer = 1;  // Initialize the right pointer to one position ahead of the left pointer.
        // Inner loop to compare prices with the leftPointer as the buy and rightPointer as the sell.
        while (rightPointer < prices.length) {
            if (prices[rightPointer] > prices[leftPointer]) {
                // Calculate the potential profit by selling at the rightPointer and buying at the leftPointer.
                int potentialProfit = prices[rightPointer] - prices[leftPointer];
                // Update maxProfit with the maximum profit found so far.
                maxProfit = Math.max(maxProfit, potentialProfit);
            } else {
                leftPointer = rightPointer;
            }
            rightPointer++;  // Move the rightPointer to the right.
        }

        return maxProfit;  // Return the maximum profit found.
    }


    public static int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Initialize minPrice to a very high value.
        int profit = 0;  // Initialize profit to 0.

        // Loop through the array of stock prices.
        for (int price : prices) {
            // Check if the current price is lower than the minimum price seen so far.
            if (price < minPrice)
                minPrice = price;  // If yes, update the minimum price to the current price.

            // Calculate the potential profit if selling at the current price and buying at the minimum price.
            int potentialProfit = price - minPrice;

            // Check if the potential profit is greater than the current maximum profit.
            if (potentialProfit > profit)
                profit = potentialProfit;  // If yes, update the maximum profit.

            // The loop continues to the next price in the array.
        }

        return profit;  // Return the maximum profit found.
    }


    public static void main(String[] args) {
        System.out.println(maxProfit2(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit1(new int[]{7, 6, 4, 3, 1}));
    }
}
