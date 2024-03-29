package hot100;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/25
 * @Copyright: https://github.com/CatTailzz
 */
public class h239_sliding_window_maximum {

    static class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            int[] res = new int[n - k + 1];
            Deque<Integer> que = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                while (!que.isEmpty() && que.peekFirst() < i - k + 1) {
                    que.pollFirst();
                }
                while (!que.isEmpty() && nums[que.peekLast()] < nums[i]) {
                    que.pollLast();
                }
                que.offer(i);

                if (i - k + 1 >= 0) {
                    res[i - k + 1] = nums[que.getFirst()];
                }
            }
            return res;
        }
    }
}
