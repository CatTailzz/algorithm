package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/25
 * @Copyright: https://github.com/CatTailzz
 */
public class h560_subarray_sum_equals_k {

    static class Solution {
        public int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            int sum = 0, res = 0;
            map.put(0, 1);
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                res += map.getOrDefault(sum - k, 0);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return res;
        }
    }
}
