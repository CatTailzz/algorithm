package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/17
 * @Copyright: https://github.com/CatTailzz
 */
public class h34_find_first_and_last_position_of_element_in_sorted_array {
    class Solution {
        private int binaryFind(int[] nums, int target) {
            int n = nums.length;
            int l = 0, r = n - 1;
            while (l <= r) {
                int m = (l + r) >> 1;
                if (nums[m] < target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            return l;
        }
        public int[] searchRange(int[] nums, int target) {
            int start = binaryFind(nums, target);
            if (start == nums.length || nums[start] != target) {
                return new int[]{-1, -1};
            }
            int end = binaryFind(nums, target + 1) - 1;
            return new int[]{start, end};
        }
    }
}
