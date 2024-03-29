package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/21
 * @Copyright: https://github.com/CatTailzz
 */
public class hj416_partition_equal_subset_sum {
    class Solution {
        public boolean canPartition(int[] nums) {
            int sum = 0;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                sum += nums[i];
            }
            if (sum % 2 == 1) {
                return false;
            }
            int target = sum / 2;
            int[] dp = new int[target + 2];
            for (int i = 0; i < n; i++) {
                for (int j = target; j >= nums[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                }
            }

            return dp[target] == target;
        }
    }
}
