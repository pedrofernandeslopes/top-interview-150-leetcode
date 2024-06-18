package RemoveElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (final int num : nums) {
            if (num != val) {
                nums[i++] = num;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        int newLength = s.removeElement(nums, val);

        // Print the modified array
        System.out.print("Modified array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i != newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
