package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/5
 * @Copyright: https://github.com/CatTailzz
 */
public class h24_swap_nodes_in_pairs {
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
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(0, head);
            ListNode pre = null, cur = head, p0 = dummy;
            while (cur != null && cur.next != null) {
                for (int i = 0; i < 2; i++) {
                    ListNode nxt = cur.next;
                    cur.next = pre;
                    pre = cur;
                    cur = nxt;
                }
                ListNode nxt = p0.next;
                nxt.next = cur;
                p0.next = pre;
                p0 = nxt;
            }
            return dummy.next;
        }
    }
}
