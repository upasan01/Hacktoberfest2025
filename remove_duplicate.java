class Solution {
  
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Index to track the position of the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i]; // Move the unique element to its correct position
                uniqueIndex++; // Increment the index for the next unique element
            }
        }

        return uniqueIndex;
    }
}
