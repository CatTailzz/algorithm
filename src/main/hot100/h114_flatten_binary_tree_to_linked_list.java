package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/15
 * @Copyright: https://github.com/CatTailzz
 */
public class h114_flatten_binary_tree_to_linked_list {
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
        private TreeNode last = null;
        public void flatten(TreeNode root) {
            if (root == null) {
                return;
            }
            flatten(root.right);
            flatten(root.left);
            root.left = null;
            root.right = last;
            last = root;
        }
    }
}
