package hot100;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/15
 * @Copyright: https://github.com/CatTailzz
 */
public class h39_combination_sum {
    class Solution {
        private int[] nums;
        private int target;
        private List<Integer> path = new ArrayList<>();
        private List<List<Integer>> res = new ArrayList<>();
        void dfs(int i, int cur) {
            if (cur == target) {
                res.add(new ArrayList<>(path));
                return;
            }
            if(i == nums.length || cur > target) {
                return;
            }
            for (int j = i; j < nums.length; j++) {
                path.add(nums[j]);
                dfs(i + 1, cur + nums[i]);
                path.remove(path.size() - 1);
            }
        }
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            this.nums = candidates;
            this.target = target;
            dfs(0, 0);
            return res;
        }
    }
}
