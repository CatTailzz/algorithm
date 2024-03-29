package hot100;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/8
 * @Copyright: https://github.com/CatTailzz
 */
public class h23_merge_k_sorted_lists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
            for (ListNode head : lists) {
                if (head != null) {
                    pq.offer(head);
                }
            }

            ListNode dummy = new ListNode(0);
            ListNode cur = dummy;
            while (!pq.isEmpty()) {
                ListNode h = pq.poll();
                if (h.next != null) {
                    pq.offer(h.next);
                }
                cur.next = h;
                cur = cur.next;
            }
            return dummy.next;
        }
    }
}
