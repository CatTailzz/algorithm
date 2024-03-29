package hot100;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/3
 * @Copyright: https://github.com/CatTailzz
 */
public class h200_number_of_islands {
    class Solution {
        static final int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        public int numIslands(char[][] grid) {
            int n = grid.length, m = grid[0].length;
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == '1') {
                        Queue<int[]> q = new ArrayDeque<>();
                        q.offer(new int[]{i, j});
                        grid[i][j] = '0';
                        while (!q.isEmpty()) {
                            int[] top = q.poll();
                            int x = top[0], y = top[1];
                            for (int k = 0; k < 4; k++) {
                                int dx = x + dir[k][0], dy = y + dir[k][1];
                                if (dx < 0 || dx >= n || dy < 0 || dy >= m || grid[dx][dy] == '0') {
                                    continue;
                                } else {
                                    q.offer(new int[]{dx, dy});
                                    grid[dx][dy] = '0';
                                }
                            }
                        }
                        res++;
                    }
                }
            }
            return res;
        }
    }
}
