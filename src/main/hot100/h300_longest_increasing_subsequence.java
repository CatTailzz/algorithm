package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/21
 * @Copyright: https://github.com/CatTailzz
 */
public class h300_longest_increasing_subsequence {
    class Solution {
        public int lengthOfLIS(int[] nums) {
            //f[i]，从0-i这一段的最大递增子序列的个数
            int n = nums.length;
            int[] f = new int[n + 1];
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        f[i] = Math.max(f[i], f[j]);
                    }
                }
                f[i] += 1;
                res = Math.max(res, f[i]);
            }
            return res;
        }
    }
}
