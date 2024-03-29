package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/3
 * @Copyright: https://github.com/CatTailzz
 */
public class h21_merge_two_sorted_lists {

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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(0);
            ListNode head = dummy;
            ListNode p1 = list1, p2 = list2;
            while (p1 != null && p2 != null) {
                if (p1.val < p2.val) {
                    head.next = p1;
                    p1 = p1.next;
                } else {
                    head.next = p2;
                    p2 = p2.next;
                }
                head = head.next;
            }
            head.next = p1 == null ? p2 : p1;
            return dummy.next;
        }
    }
}
