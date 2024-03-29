package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/21
 * @Copyright: https://github.com/CatTailzz
 */
public class h322_coin_change {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[10009];
            for (int i = 1; i < 10009; i++) {
                dp[i] = amount + 1;
            }
            for (int i = 0; i < coins.length; i++) {
                for (int j = coins[i]; j <= amount; j++) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
            return dp[amount] > amount ? -1 : dp[amount];
        }
    }
}
