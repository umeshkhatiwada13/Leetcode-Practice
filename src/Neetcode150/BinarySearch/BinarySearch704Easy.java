package Neetcode150.BinarySearch;

/**
 * @author umeshkhatiwada13
 * @project Leetcode
 * @created 15/10/2023 - 13:14
 */
public class BinarySearch704Easy {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
    }
}
