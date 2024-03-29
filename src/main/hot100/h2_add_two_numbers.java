package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/3
 * @Copyright: https://github.com/CatTailzz
 */
public class h2_add_two_numbers {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0);
            ListNode head = dummy;
            int pre = 0;
            while (l1 != null || l2 != null) {
                int k = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + pre;
                pre = k / 10;
                k %= 10;
                head.next = new ListNode(k);
                head = head.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            if (pre != 0) {
                head.next = new ListNode(pre);
            }
            return dummy.next;
        }
    }
}
