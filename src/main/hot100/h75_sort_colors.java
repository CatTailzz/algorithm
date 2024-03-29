package hot100;

import java.util.Set;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/25
 * @Copyright: https://github.com/CatTailzz
 */
public class h75_sort_colors {

    class Solution {
        public void sortColors(int[] nums) {
            int n = nums.length;
            int p1 = 0, p2 = n - 1;
            for (int i = 0; i <= p2; i++) {
                while (i <= p2 && nums[i] == 2) {
                    int t = nums[i];
                    nums[i] = nums[p2];
                    nums[p2] = t;
                    p2--;
                }
                if (nums[i] == 0) {
                    int t = nums[i];
                    nums[i] = nums[p1];
                    nums[p1] = t;
                    p1++;
                }
            }
        }
    }
}
