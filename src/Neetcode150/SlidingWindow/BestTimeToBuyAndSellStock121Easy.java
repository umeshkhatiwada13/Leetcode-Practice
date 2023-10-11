package Neetcode150.SlidingWindow;

/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode
 * @created 10/10/2023 - 23:20
 */
public class BestTimeToBuyAndSellStock121Easy {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int arrayLength = prices.length;
        short leftPointer = 0;
        short rightPointer = 1;
        for (int i = 0; i <= arrayLength - 1; i++) {
            while (rightPointer < arrayLength) {
                maxProfit = Math.max(maxProfit, prices[rightPointer] - prices[leftPointer]);
                rightPointer++;
            }
            leftPointer++;
            rightPointer = (short) (leftPointer + 1);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
