public class SearchIndexPosition35 {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        int arrayLength = nums.length;
        for (int i = 0; i < arrayLength; i++) {
            if (nums[i] == target) return i;
            else if (nums[arrayLength - 1] < target) index = arrayLength;
            else if (nums[0] > target) index = 0;
            else if (nums[i] < target && nums[i + 1] > target) index = i + 1;
        }
        return index;
    }

    public static void main(String[] args) {
//        int arrayList = new
        System.out.println("Index "+searchInsert(new int[]{1,3,4,7,9},8));
    }
}
