import java.util.Arrays;

/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode
 * @created 04/10/2023 - 19:18
 */
public class MaximumWealth1672Easy {
    public static int maximumWealth(int[][] accounts) {
//        int maxWealth = 0;
//        for (int[] customer : accounts) {
//            maxWealth = Math.max(maxWealth, Arrays.stream(customer).sum());
//        }
//        return maxWealth;

        return Arrays.stream(accounts).mapToInt(c -> Arrays.stream(c).sum())
                .max().orElse(Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        int[][] w = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(w));
    }
}
