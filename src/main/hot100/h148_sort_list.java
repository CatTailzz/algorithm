package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/8
 * @Copyright: https://github.com/CatTailzz
 */
public class h148_sort_list {

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
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode fast = head.next, slow = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode tmp = slow.next;
            slow.next = null;
            ListNode left = sortList(head);
            ListNode right = sortList(tmp);

            //合并
            ListNode h = new ListNode(0);
            ListNode dummy = h;
            while (left != null && right != null) {
                if (left.val < right.val) {
                    h.next = left;
                    left = left.next;
                } else {
                    h.next = right;
                    right = right.next;
                }
                h = h.next;
            }
            h.next = left != null ? left : right;
            return dummy.next;
        }
    }
}
