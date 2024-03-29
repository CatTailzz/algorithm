package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/23
 * @Copyright: https://github.com/CatTailzz
 */
public class h11_container_with_most_water {
    static class Solution {
        public int maxArea(int[] height) {
            int i = 0, j = height.length - 1;
            int res = 0;
            while (i < j) {
                res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
                if (height[i] < height[j]) {
                    i++;
                } else {
                    j--;
                }
            }
            return res;
        }
    }
}
