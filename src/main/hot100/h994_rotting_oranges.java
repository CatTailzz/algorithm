package hot100;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/3
 * @Copyright: https://github.com/CatTailzz
 */
public class h994_rotting_oranges {
    class Solution {
        static final int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        public int orangesRotting(int[][] grid) {
            Queue<int[]> que = new ArrayDeque<>();
            int n = grid.length, m = grid[0].length;
            int cnt = 0;
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 2) {
                        que.offer(new int[]{i, j});
                    } else if (grid[i][j] == 1) {
                        cnt++;
                    }
                }
            }

            while (!que.isEmpty()) {
                int t = que.size();
                int flag = 0;
                for (int k = 0; k < t; k++) {
                    int[] top = que.poll();
                    int x = top[0], y = top[1];
                    for (int i = 0; i < 4; i++) {
                        int dx = x + dir[i][0], dy = y + dir[i][1];
                        if (dx >=0 && dy >= 0 && dx < n && dy < m && grid[dx][dy] == 1) {
                            flag = 1;
                            grid[dx][dy] = 2;
                            que.offer(new int[]{dx, dy});
                            cnt--;
                        }
                    }
                }
                if (flag == 1) {
                    res++;
                }
            }
            return cnt == 0 ? res : -1;
        }
    }

}
