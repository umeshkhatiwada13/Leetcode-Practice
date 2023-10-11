package Neetcode150.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author umeshkhatiwada13
 * @project Leetcode
 * @created 10/10/2023 - 17:44
 */
public class ContainsDuplicate217Easy {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> countMap = new HashMap<>();
        Arrays.sort(nums);
        for (int a : nums) {
            if (countMap.containsKey(a)) {
                return true;
            } else {
                countMap.put(a, Boolean.TRUE);
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
