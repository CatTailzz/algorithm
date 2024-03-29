package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/5
 * @Copyright: https://github.com/CatTailzz
 */
public class h138_copy_list_with_random_pointer {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    class Solution {
        static Map<Node, Node> map = new HashMap<>();
        public Node copyRandomList(Node head) {
            if (head == null) {
                return head;
            }
            if (map.get(head) == null) {
                Node cur = new Node(head.val);
                map.put(head, cur);
                cur.next = copyRandomList(head.next);
                cur.random = copyRandomList(head.random);
            }
            return map.get(head);
        }
    }
}
