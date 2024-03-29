package hot100;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/15
 * @Copyright: https://github.com/CatTailzz
 */
public class h347_top_k_frequent_elements {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            int[] res = new int[k];
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
            for (var x : map.entrySet()) {
                int[] t = new int[]{x.getKey(), x.getValue()};
                pq.offer(t);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
            for (int i = 0; i < k; i++) {
                res[i] = pq.poll()[0];
            }
            return res;
        }
    }
}
