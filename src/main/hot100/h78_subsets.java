package hot100;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/15
 * @Copyright: https://github.com/CatTailzz
 */
public class h78_subsets {
    class Solution {
        private int[] nums;
        private List<Integer> path = new ArrayList<>();
        private List<List<Integer>> res = new ArrayList<>();

        void dfs(int i) {
            if (i == nums.length) {
                res.add(new ArrayList<>(path));
                return;
            }
            dfs(i + 1);
            path.add(nums[i]);
            dfs(i + 1);
            path.remove(path.size() - 1);
        }

        public List<List<Integer>> subsets(int[] nums) {
            this.nums = nums;
            dfs(0);
            return res;
        }
    }
}
