package MajorityElement;

class Solution {
    public int majorityElement(int[] nums) {
        Integer ans = null;
        int count = 0;

        for (final int num : nums) {
            if (count == 0)
                ans = num;
            count += num == ans ? 1 : -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 2, 2, 3};
        System.out.println("Output for [3, 2, 3]: " + solution.majorityElement(nums1));

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Output for [2, 2, 1, 1, 1, 2, 2]: " + solution.majorityElement(nums2));
    }
}
