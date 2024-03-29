package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/23
 * @Copyright: https://github.com/CatTailzz
 */
public class h15_3sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            int x = nums[i];
            if (i > 0 && nums[i - 1] == x) {
                continue;
            }
            if (x + nums[i + 1] + nums[i + 2] > 0) {
                break;
            }
            if (x + nums[n - 1] + nums[n - 2] < 0) {
                continue;
            }

            int j = i + 1, k = n - 1;
            while (j < k) {
                int s = nums[j] + nums[k] + x;
                if (s > 0) {
                    k--;
                } else if (s < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(x, nums[j], nums[k]));
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    k--;
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return res;
    }
}
