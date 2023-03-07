import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Umeshkhatiwada13
 * @created 27/02/2023 9:23 PM
 **/
public class MaximumToysHackerrankDay7 {
    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);
        int sum = 0;
        int count = 0;
        for (Integer price : prices) {
            sum = sum + price;
            if (sum >= k) break;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maximumToys(Arrays.asList(1, 2, 3, 4), 7));
    }

}
