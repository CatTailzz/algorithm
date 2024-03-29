package hot100;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/15
 * @Copyright: https://github.com/CatTailzz
 */
public class h215_kth_largest_element_in_an_array {
    class Solution {
        int[] nums;
        public int findKthLargest(int[] _nums, int k) {
            nums = _nums;
            int n = nums.length;
            return qselect(0, n - 1, k - 1);
        }

        private int qselect(int l, int r, int k) {
            if (l == r) {
                return nums[k];
            }
            int x = nums[l], i = l - 1, j = r + 1;
            while (i < j) {
                do {
                    i++;
                } while (nums[i] < x);
                do {
                    j--;
                } while (nums[j] > x);
                if (i < j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            if (k <= j) {
                return qselect(l, j, k);
            } else {
                return qselect(j + 1, r, k);
            }



        }
    }
}
