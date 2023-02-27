import java.util.Arrays;
import java.util.List;

/**
 * @author Umeshkhatiwada13
 * @created 23/02/2023 1:10 PM
 **/
public class JumpingOnTheCloudsDay5 {
    /**
     * Calculates the minimum number of steps required to jump from the starting position to the last cloud in a list of clouds.
     * Time Complexity: O(n) - The loop iterates through each element in the list once, with constant time operations inside the loop.
     * Space Complexity: O(1) - The additional space used by this algorithm is constant, regardless of the size of the input.
     *
     * @param c the list of clouds, represented as integers (0 or 1)
     * @return the minimum number of steps required to jump from the starting position to the last cloud
     */
    public static int jumpingOnClouds(List<Integer> c) {
        int totalStep = 0;
        int index = 0;
        while (index < c.size() - 1) {
            if (index + 2 < c.size() && c.get(index + 2) == 0) {
                index = index + 2;
            } else {
                index++;
            }
            totalStep++;
        }
        return totalStep;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0)));
        System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0)));
        System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0, 0)));
    }
}
