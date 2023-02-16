import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Umeshkhatiwada13
 * @created 16/02/2023 11:34 PM
 **/
public class SockMerchantHackerRank {
    /**
     * Counts the number of pairs of socks with matching colors in a given list.
     * Time Complexity: O(n log n) - Sorting the list using Collections.sort() takes O(n log n) time and the loop iterates n times in the worst case.
     * Space Complexity: O(1) - The additional space used by this algorithm is constant, regardless of the size of the input.
     *
     * @param n the number of socks in the list
     * @param ar the list of socks, represented as integers
     * @return the number of pairs of socks with matching colors
     */
    public static int sockMerchant(int n, List<Integer> ar) {
        // Sort the arraylist as each color is represented by number and the same color will be together after sorting
        Collections.sort(ar);
        int pair = 0;
        for (int i = 0; i < n; ) {
            if (n > i + 1 && ar.get(i) == ar.get(i + 1)) {
                pair++;
                // if current(i) element and next element(i+1) are same means they form pair,
                // so no need to check for i+1 element
                i = i + 2;
            } else i++;
        }
        return pair;
    }

    public static void main(String[] args) {

        System.out.println("TOtal pair " + sockMerchant(7, Arrays.asList(1, 2, 1, 2, 1, 3, 2)));
        System.out.println("TOtal pair " + sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }
}
