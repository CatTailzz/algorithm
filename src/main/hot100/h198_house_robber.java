package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/21
 * @Copyright: https://github.com/CatTailzz
 */
public class h198_house_robber {
    class Solution {
        public int rob(int[] nums) {
            int n = nums.length;
            int[] f = new int[n + 2];
            for (int i = 0; i < n; i++) {
                f[i + 2] = Math.max(f[i + 1], f[i] + nums[i]);
            }
            return f[n + 1];
        }
    }
}
