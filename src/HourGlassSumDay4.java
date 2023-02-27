import java.util.Arrays;
import java.util.List;

/**
 * @author Umeshkhatiwada13
 * @created 26/02/2023 6:21 PM
 **/
public class HourGlassSumDay4 {
    /**
     * Calculates the maximum hourglass sum in a 2D array.
     * Time Complexity: O(n^2) - The nested loop iterates over all elements in the 2D array, which takes O(n^2) time.
     * Space Complexity: O(1) - The additional space used by this algorithm is constant, regardless of the size of the input.
     *
     * @param arr the 2D array to find the maximum hourglass sum in
     * @return the maximum hourglass sum in the array
     */
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(hourglassSum(Arrays.asList(
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 1, 0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 0, 2, 4, 4, 0),
                Arrays.asList(0, 0, 0, 2, 0, 0),
                Arrays.asList(0, 0, 1, 2, 4, 0))));
    }
}
