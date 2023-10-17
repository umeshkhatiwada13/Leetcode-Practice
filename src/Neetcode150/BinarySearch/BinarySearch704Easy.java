package Neetcode150.BinarySearch;

/**
 * @author umeshkhatiwada13
 * @project Leetcode
 * @created 15/10/2023 - 13:14
 */
public class BinarySearch704Easy {
    public static int search(int[] nums, int target) {
        // Initialize the left boundary of the search range.
        int left = 0;
        // Initialize the right boundary of the search range.
        int right = nums.length - 1;

        // Continue the loop as long as the left index is less than or equal to the right index.
        while (left <= right) {
            // Calculate the middle index of the current search range.
            int mid = (left + right) / 2;
            // Check if the element at the middle index is equal to the target value.
            if (nums[mid] == target)
                // If it is, return the index where the target was found.
                return mid;

            // If the element at the middle index is greater than the target value,
            else if (nums[mid] > target) {
                // Adjust the right boundary to search the left half of the current range.
                right = mid - 1;
            } else {
                // If the element at the middle index is less than the target value,
                // Adjust the left boundary to search the right half of the current range.
                left = mid + 1;
            }
        }
        // If the loop finishes without finding the target value, return -1 to indicate
        // that the target is not present in the array
        return -1;

    }

    public static void main(String[] args) {
        search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
    }
}
