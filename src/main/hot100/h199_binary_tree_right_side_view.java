package hot100;

import java.util.*;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/14
 * @Copyright: https://github.com/CatTailzz
 */
public class h199_binary_tree_right_side_view {
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
        public List<Integer> rightSideView(TreeNode root) {
            Queue<TreeNode> q = new ArrayDeque<>();

            if (root != null) {
                q.add(root);
            }
            List<Integer> res = new ArrayList<>();
            while (!q.isEmpty()) {
                int k = q.size();
                while (k > 0) {
                    k--;
                    TreeNode node = q.poll();
                    if (k == 0) {
                        res.add(node.val);
                    }
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                }
            }
            return res;
        }
    }
}
