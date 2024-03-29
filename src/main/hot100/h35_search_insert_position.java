package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/16
 * @Copyright: https://github.com/CatTailzz
 */
public class h35_search_insert_position {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int l = 0, r = nums.length - 1;
            while (l < r) {
                int m = (l + r) >> 1;
                if (nums[m] == target) {
                    return m;
                } else if (nums[m] < target) {
                    r = m - 1;
                } else {
                    l = m;
                }
            }
            return l;
        }
    }
}
