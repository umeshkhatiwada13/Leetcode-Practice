/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode
 * @created 04/10/2023 - 19:46
 */
public class NumberOfStepsToReduceToZero1342Easy {
    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
