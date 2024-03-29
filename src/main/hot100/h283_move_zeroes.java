package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/22
 * @Copyright: https://github.com/CatTailzz
 */
public class h283_move_zeroes {

    static class Solution {
        public void moveZeroes(int[] nums) {
            int i = 0, j = 0;
            int n = nums.length;
            while (j < n) {
                if (nums[j] != 0) {
                    int t = nums[i];
                    nums[i++] = nums[j];
                    nums[j] = t;
                }
                j++;
            }
        }
    }
}

