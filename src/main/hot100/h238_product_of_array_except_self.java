package hot100;/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/25
 * @Copyright: https://github.com/CatTailzz
 */
public class h238_product_of_array_except_self {

    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] pre = new int[n + 1], suf = new int[n + 1];
            pre[0] = 1;
            suf[n] = 1;
            for (int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] * nums[i - 1];
            }
            for (int i = n - 2; i >= 0; i--) {
                suf[i] = suf[i + 1] * nums[i + 1];
            }
            for (int i = 0; i < n; i++) {
                nums[i] = pre[i] * suf[i];
            }
            return nums;
        }
    }
}
