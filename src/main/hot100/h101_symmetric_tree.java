package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/13
 * @Copyright: https://github.com/CatTailzz
 */
public class h101_symmetric_tree {
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
        private boolean isSame(TreeNode l, TreeNode r) {
            if (l == null || r == null) {
                return l == r;
            }
            return l.val == r.val && isSame(l.left, r.right) && isSame(l.right, r.left);
        }
        public boolean isSymmetric(TreeNode root) {
            return isSame(root.left, root.right);
        }
    }
}
