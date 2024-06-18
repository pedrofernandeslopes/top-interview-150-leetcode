package MergeSortedArrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0)
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 3;
        nums1[2] = 5;

        int[] nums2 = {2, 4, 6};

        solution.merge(nums1, 3, nums2, 3);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
