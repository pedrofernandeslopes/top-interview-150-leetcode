package RemoveDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (final int num : nums)
            if (i < 1 || num > nums[i - 1])
                nums[i++] = num;

        return i;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = sol.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int j = 0; j < k; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();
    }
}
