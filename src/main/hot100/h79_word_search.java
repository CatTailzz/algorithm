package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/16
 * @Copyright: https://github.com/CatTailzz
 */
public class h79_word_search {
    class Solution {
        static int m;
        static int n;
        public boolean exist(char[][] board, String word) {
            n = board.length;
            m = board[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (dfs(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean dfs(char[][] board, int x, int y, String word, int index) {
            if (index == word.length()) {
                return true;
            }
            if (x >= n || x < 0 || y >= m || y < 0 || board[x][y] == '#') {
                return false;
            }
            if (word.charAt(index) != board[x][y]) {
                return false;
            }
            char t = board[x][y];
            board[x][y] = '#';
            boolean res = dfs(board, x + 1, y, word, index + 1) ||
                    dfs(board, x, y + 1, word, index + 1) ||
                    dfs(board, x - 1, y, word, index + 1) ||
                    dfs(board, x, y - 1, word, index + 1);
            board[x][y] = t;
            return res;
        }
    }
}
