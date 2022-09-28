import java.util.HashMap;
import java.util.Map;

/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode-Practice
 * @created 27/09/2022 - 21:04
 */
public class TwoSumV2 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //if compliment of given number exists in map , means sum of these two number is target
            //return index of two numbers , i being current index
            if (complementMap.containsKey(nums[i])) {
                return new int[]{complementMap.get(nums[i]), i};
            } else {
                // if complement is not found in map, save current index with compliment of current number as key
                complementMap.put(target - nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        twoSum(new int[]{2, 1, 5, 3}, 4);
    }
}
