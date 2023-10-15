package Neetcode150.BinarySearch;

import java.util.Arrays;

/**
 * @author umeshkhatiwada13
 * @project Leetcode
 * @created 15/10/2023 - 13:14
 */
public class BinarySearch704Easy {
    public static int search(int[] nums, int target) {
        int mid = nums.length / 2;
        int left = 0;
        int right = nums.length - 1;
        int targetIndex = -1;
        boolean found = false;
        int[] newArray = Arrays.copyOfRange(nums, left, right);
        ;
        while (!found) {
            newArray = Arrays.copyOfRange(newArray, left, right);
            if (target == nums[mid]) {
                found = true;
                targetIndex = mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return targetIndex;
    }

    public static void main(String[] args) {
        search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
    }
}
