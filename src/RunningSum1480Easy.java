/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode
 * @created 04/10/2023 - 08:40
 */
public class RunningSum1480Easy {
    public static int[] runningSum(int[] nums) {
        int[] returnArray = new int[nums.length];
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            returnArray[i] = totalSum;
        }
        return returnArray;
    }

    public static void main(String[] args) {
        int[] ret = runningSum(new int[]{1, 2, 3, 4});
        for (int a: ret){
            System.out.println(a);
        }
        System.out.println();
    }
}
