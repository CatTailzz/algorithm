package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/25
 * @Copyright: https://github.com/CatTailzz
 */
public class h53_maximum_subarray {

    static class Solution {
        public int maxSubArray(int[] nums) {
            int pre = 0, res = -100000;
            for (int i = 0; i < nums.length; i++) {
                if (pre < 0) {
                    pre = 0;
                }
                pre += nums[i];
                res = Math.max(res, pre);
            }
            return res;
        }
    }
}
