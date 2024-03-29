package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/21
 * @Copyright: https://github.com/CatTailzz
 */
public class h279_perfect_squares {
    class Solution {
        public int numSquares(int n) {
            int[] nums = new int[101];
            for (int i = 0; i < 101; i++) {
                nums[i] = i * i;
            }
            int[] dp = new int[n + 2];
            for (int i = 1; i < n + 2; i++) {
                dp[i] = Integer.MAX_VALUE;
            }
            for (int i = 1; i <= Math.sqrt(n); i++) {
                for (int j = nums[i]; j <= n; j++) {
                    dp[j] = Math.min(dp[j], dp[j - nums[i]] + 1);
                }
            }
            return dp[n];
        }
    }
}
