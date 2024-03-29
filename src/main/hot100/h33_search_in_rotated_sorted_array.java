package hot100;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/17
 * @Copyright: https://github.com/CatTailzz
 */
public class h33_search_in_rotated_sorted_array {
    class Solution {
        public int search(int[] nums, int target) {
            return 1;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Long> pq = new PriorityQueue<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return (int) (o2 - o1 > 0 ? 1 : -1);
            }
        });
        pq.offer(13L);
        pq.offer(5L);
        pq.offer(19L);
        pq.offer(1L);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }



    }
}
