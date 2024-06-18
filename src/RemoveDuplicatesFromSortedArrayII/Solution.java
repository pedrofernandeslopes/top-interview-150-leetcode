package RemoveDuplicatesFromSortedArrayII;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (final int num : nums)
            if (i < 2 || num > nums[i - 2])
                nums[i++] = num;

        return i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Teste 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("k1 = " + k1);
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // Teste 2
        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("k2 = " + k2);
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}

