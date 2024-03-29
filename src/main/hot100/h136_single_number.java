package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/25
 * @Copyright: https://github.com/CatTailzz
 */
public class h136_single_number {
    class Solution {
        public int singleNumber(int[] nums) {
            int res = 0;
            for (int num : nums) {
                res ^= num;
            }
            return res;
        }
    }
}
