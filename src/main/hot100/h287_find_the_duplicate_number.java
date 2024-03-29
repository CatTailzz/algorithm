package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/1
 * @Copyright: https://github.com/CatTailzz
 */

/**
 * 1 3 4 2 2
 * l   m   r
 * 1   2   4
 */
public class h287_find_the_duplicate_number {
    static class Solution {
        public int findDuplicate(int[] nums) {
            int n = nums.length;
            int l = 1, r = n - 1;

            while (l < r) {
                int m = (l + r) >> 1;
                int cnt = 0;
                for (int c : nums) {
                    if (c <= m) {
                        cnt++;
                    }
                }
                if (cnt > m) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            return l;
        }

    }
}
