package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/13
 * @Copyright: https://github.com/CatTailzz
 */
public class h230_kth_smallest_element_in_a_bst {
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
        int cnt, res;
        private void dfs(TreeNode root, int k) {
            if (root == null) {
                return;
            }
            dfs(root.left, k);
            cnt++;
            if (cnt == k) {
                res = root.val;
                return;
            }
            dfs(root.right, k);
        }
        public int kthSmallest(TreeNode root, int k) {
            dfs(root, k);
            return res;
        }
    }
}
