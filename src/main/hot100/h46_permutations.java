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
public class h46_permutations {
    class Solution {
        private int[] nums;
        private List<Integer> path;
        private boolean[] onPath;
        private final List<List<Integer>> res = new ArrayList<>();

        void dfs(int i) {
            if (i == nums.length) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int j = 0; j < nums.length; j++) {
                if (!onPath[j]) {
                    path.set(i, nums[j]);
                    onPath[j] = true;
                    dfs(i + 1);
                    onPath[j] = false;
                }
            }
        }
        public List<List<Integer>> permute(int[] nums) {
            this.nums = nums;
            path = Arrays.asList(new Integer[nums.length]);
            onPath = new boolean[nums.length];
            dfs(0);
            return res;
        }
    }

}
