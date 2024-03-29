package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/3
 * @Copyright: https://github.com/CatTailzz
 */
public class h160_intersection_of_two_linked_lists {

     public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
        }
     }

    static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode p1 = headA;
            ListNode p2 = headB;
            while (p1 != p2) {
                p1 = p1 != null ? p1.next : headB;
                p2 = p2 != null ? p2.next : headA;
            }
            return p1;
        }
    }
}
