public class SearchIndexPosition35BinarySearch {
    public static int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (nums[mid] == target) {
                first = mid;
                break;
            } else if (nums[mid] > target) last = mid - 1;
            else first = mid + 1;
        }
        return first;
    }

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println(searchInsert(new int[]{1, 2, 3, 4, 5, 6}, 3));

    }
}
