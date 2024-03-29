package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/5
 * @Copyright: https://github.com/CatTailzz
 */
public class h19_remove_nth_node_from_end_of_list {

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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head);
            ListNode p = dummy, q = dummy;

            for (int i = 0; i < n; i++) {
                q = q.next;
            }

            while (q.next != null) {
                p = p.next;
                q = q.next;
            }
            p.next = p.next.next;
            return dummy.next;
        }
    }
}
