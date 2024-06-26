package BestTimeToBuyAndSellStockII;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i+1]) {
                maxProfit += prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Exemplos de preços das ações
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 2, 3, 4, 5};
        int[] prices3 = {7, 6, 4, 3, 1};

        // Teste 1
        int profit1 = solution.maxProfit(prices1);
        System.out.println("Lucro máximo para prices1: " + profit1); // Esperado: 7

        // Teste 2
        int profit2 = solution.maxProfit(prices2);
        System.out.println("Lucro máximo para prices2: " + profit2); // Esperado: 4

        // Teste 3
        int profit3 = solution.maxProfit(prices3);
        System.out.println("Lucro máximo para prices3: " + profit3); // Esperado: 0
    }
}

