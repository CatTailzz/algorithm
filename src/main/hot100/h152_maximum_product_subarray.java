package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/21
 * @Copyright: https://github.com/CatTailzz
 */
public class h152_maximum_product_subarray {
    class Solution {
        public int maxProduct(int[] nums) {
            int n = nums.length, res = nums[0];
            int[][] dp = new int[n][2];
            dp[0][0] = nums[0];
            dp[0][1] = nums[0];
            for (int i = 1; i < n; i++) {
                dp[i][0] = Math.min(nums[i], Math.min(dp[i - 1][0] * nums[i], dp[i - 1][1] * nums[i]));
                dp[i][1] = Math.max(nums[i], Math.max(dp[i - 1][0] * nums[i], dp[i - 1][1] * nums[i]));
                res = Math.max(res, Math.max(dp[i][0], dp[i][1]));
            }
            return res;
        }
    }
}
