package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/23
 * @Copyright: https://github.com/CatTailzz
 */
public class h42_trapping_rain_water {

    static class Solution {
        public int trap(int[] height) {
            int n = height.length;
            int[] pre = new int[n];
            int[] suf = new int[n];
            pre[0] = height[0];
            for (int i = 1; i < n; i++) {
                pre[i] = Math.max(height[i], pre[i - 1]);
            }
            suf[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                suf[i] = Math.max(suf[i + 1], height[i]);
            }

            int res = 0;
            for (int i = 0; i < n; i++) {
                res += Math.min(pre[i], suf[i]) - height[i];
            }

            return res;
        }
    }

}
