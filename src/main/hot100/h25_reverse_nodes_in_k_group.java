package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/5
 * @Copyright: https://github.com/CatTailzz
 */
public class h25_reverse_nodes_in_k_group {
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
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode dummy = new ListNode(0, head);
            ListNode pre = null, cur = head, p0 = dummy;
            int n = 0;
            ListNode cnt = head;
            while (cnt != null) {
                n++;
                cnt = cnt.next;
            }
            while (n >= k) {
                n -= k;
                for (int i = 0; i < k; i++) {
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
