package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/15
 * @Copyright: https://github.com/CatTailzz
 */
public class h437_path_sum_iii {
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
        private Map<Long, Integer> map = new HashMap<>();

        private int helper(TreeNode root, int targetSum, long curSum) {
            int res = 0;
            if (root == null) {
                return 0;
            }
            curSum += root.val;
            if (map.containsKey(curSum - targetSum)) {
                res += map.get(curSum - targetSum);
            }
            map.put(curSum, map.getOrDefault(curSum, 0) + 1);
            res += helper(root.left, targetSum, curSum);
            res += helper(root.right, targetSum, curSum);
            map.put(curSum, map.getOrDefault(curSum, 0) - 1);
            return res;
        }

        public int pathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return 0;
            }
            map.put(0L, 1);
            return helper(root, targetSum, 0);
        }

    }
}
