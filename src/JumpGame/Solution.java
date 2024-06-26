package JumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;

        for (int reach = 0; i < nums.length && i <= reach; ++i) {
            reach = Math.max(reach, i + nums[i]);
        }

        return i == nums.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Exemplos de arrays nums
        int[] nums1 = {2, 3, 1, 1, 4}; // Pode alcançar o final
        int[] nums2 = {3, 2, 1, 0, 4}; // Não pode alcançar o final
        int[] nums3 = {0};             // Array de um elemento

        // Teste 1
        boolean result1 = solution.canJump(nums1);
        System.out.println("Pode alcançar o final para nums1? " + result1); // Esperado: true

        // Teste 2
        boolean result2 = solution.canJump(nums2);
        System.out.println("Pode alcançar o final para nums2? " + result2); // Esperado: false

        // Teste 3
        boolean result3 = solution.canJump(nums3);
        System.out.println("Pode alcançar o final para nums3? " + result3); // Esperado: true (array de um elemento sempre pode)
    }
}

