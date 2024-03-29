package hot100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/13
 * @Copyright: https://github.com/CatTailzz
 */
public class h94_binary_tree_inorder_traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Stack<TreeNode> stk = new Stack<>();
            while (root != null || !stk.isEmpty()) {
                if (root != null) {
                    stk.push(root);
                    root = root.left;
                } else {
                    root = stk.peek();
                    stk.pop();
                    res.add(root.val);
                    root = root.right;
                }
            }
            return res;
        }

    }


}
