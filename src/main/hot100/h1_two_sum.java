package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/22
 * @Copyright: https://github.com/CatTailzz
 */
public class h1_two_sum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{2, 7, 11, 15};
        int[] res = solution.twoSum(arr, 9);
        for (int n : res) {
            System.out.println(n);
        }
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{map.get(target - nums[i]), i};
                }
                map.put(nums[i], i);
            }
            return new int[0];
        }
    }
}

