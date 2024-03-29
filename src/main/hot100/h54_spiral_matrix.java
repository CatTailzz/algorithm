package hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/13
 * @Copyright: https://github.com/CatTailzz
 */
public class h54_spiral_matrix {

    class Solution {
        static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        public List<Integer> spiralOrder(int[][] matrix) {
            int cur = 0;
            int x = 0, y = 0;
            int n = matrix.length, m = matrix[0].length;
            List<Integer> res = new ArrayList<>();
            while (res.size() != n * m) {
                res.add(matrix[x][y]);
                matrix[x][y] = 999;
                int dx = x + dir[cur][0], dy = y + dir[cur][1];
                if (dx >= 0 && dy >= 0 && dx < n && dy < m && matrix[dx][dy] != 999) {
                    x = dx;
                    y = dy;
                } else {
                    cur = (cur + 1) % 4;
                    x = x + dir[cur][0];
                    y = y + dir[cur][1];
                }
            }
            return res;
        }
    }
}
