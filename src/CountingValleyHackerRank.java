/**
 * @author Umeshkhatiwada13
 * @created 21/02/2023 4:48 PM
 **/
public class CountingValleyHackerRank {
    /**
     * Counts the number of valleys traversed by a hiker, given the number of steps taken and the path taken.
     * Time Complexity: O(n) - The loop iterates n times in the worst case, where n is the number of steps taken by the hiker.
     * Space Complexity: O(1) - The additional space used by this algorithm is constant, regardless of the size of the input.
     *
     * @param steps the number of steps taken by the hiker
     * @param path  the path taken by the hiker, represented as a string of "U" (up) and "D" (down) steps
     * @return the number of valleys traversed by the hiker
     */
    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int valley = 0;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                altitude++;
                // if altitude reaches 0, hiker just completed a valley
                if (altitude == 0) valley++;
            } else altitude--;
        }
        return valley;
    }

    public static void main(String[] args) {
        System.out.println("Valley Travelled " + countingValleys(6, "DUDUDU"));
    }
}
