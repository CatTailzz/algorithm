package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/15
 * @Copyright: https://github.com/CatTailzz
 */
public class h124_binary_tree_maximum_path_sum {
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
        private int res = Integer.MIN_VALUE;
        private int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int l = dfs(root.left);
            int r = dfs(root.right);
            res = Math.max(res, l + r + root.val);
            return Math.max(Math.max(l, r) + root.val, 0);
        }
        public int maxPathSum(TreeNode root) {
            int k = dfs(root);
            return res;
        }
    }
}
