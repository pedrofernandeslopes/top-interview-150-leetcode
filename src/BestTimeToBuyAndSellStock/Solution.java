package BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Exemplos de preços das ações
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {1, 2, 3, 4, 5};

        // Teste 1
        int profit1 = solution.maxProfit(prices1);
        System.out.println("Lucro máximo para prices1: " + profit1); // Esperado: 5

        // Teste 2
        int profit2 = solution.maxProfit(prices2);
        System.out.println("Lucro máximo para prices2: " + profit2); // Esperado: 0

        // Teste 3
        int profit3 = solution.maxProfit(prices3);
        System.out.println("Lucro máximo para prices3: " + profit3); // Esperado: 4
    }
}
