/**
 * @author Umeshkhatiwada13
 * @created 21/02/2023 4:48 PM
 **/
public class CountingValleyHackerRank {
    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        String[] pathArray = path.split("");
        String currentStep;
        int valley = 0;
        for (int i = 0; i < steps; i++) {
            currentStep = pathArray[i];
            if (currentStep.equals("U")) {
                altitude++;
                if (altitude == 0) valley++;
            } else altitude--;
        }
        return valley;
    }

    public static void main(String[] args) {
        System.out.println("Valley Travelled " + countingValleys(6, "DUDUDU"));
    }
}
