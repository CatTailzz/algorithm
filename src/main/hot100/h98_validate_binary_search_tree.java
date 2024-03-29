package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/13
 * @Copyright: https://github.com/CatTailzz
 */
public class h98_validate_binary_search_tree {
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
        public boolean isValidBST(TreeNode root) {
            return traversal(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private boolean traversal(TreeNode root, long l, long r) {
            if (root == null) {
                return true;
            }
            int k = root.val;
            return k > l && k < r && traversal(root.left, l, k) && traversal(root.right, k, r);
        }
    }
}
