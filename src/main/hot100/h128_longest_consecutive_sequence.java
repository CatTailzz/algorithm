package hot100;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/23
 * @Copyright: https://github.com/CatTailzz
 */
public class h128_longest_consecutive_sequence {

    static class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }

            int res = 0;
            for (int s : set) {
                if (!set.contains(s - 1)) {
                    int cur = s;
                    while (set.contains(cur + 1)) {
                        cur = cur + 1;
                    }
                    res = Math.max(res, cur - s + 1);
                } else {
                    continue;
                }
            }

            return res;
        }
    }
}
