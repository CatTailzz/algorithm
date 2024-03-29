package hot100;

import java.beans.PropertyChangeListenerProxy;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/13
 * @Copyright: https://github.com/CatTailzz
 */
public class h108_convert_sorted_array_to_binary_search_tree {
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
        public TreeNode sortedArrayToBST(int[] nums) {
            return help(nums, 0, nums.length - 1);
        }

        private TreeNode help(int[] nums, int l, int r) {
            if (l > r) {
                return null;
            }
            int m = (l + r) >> 1;
            TreeNode root = new TreeNode(nums[m]);
            root.left = help(nums, l, m - 1);
            root.right = help(nums, m + 1, r);
            return root;
        }
    }


}
