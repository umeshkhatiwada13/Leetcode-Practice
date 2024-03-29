import java.util.Arrays;

public class TwoSum {
    public static Integer[] targetArray(Integer[] inputArray, int target) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == target) {
                    return new Integer[]{i, j};
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Integer[] a = {3,2,4};
        int target = 6;
        System.out.println("Target array is " + Arrays.toString(targetArray(a, target)));
    }
}
