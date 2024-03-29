package hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/15
 * @Copyright: https://github.com/CatTailzz
 */
public class h22_generate_parentheses {
    class Solution {
        private List<String> res = new ArrayList<>();
        private char[] path;
        int sz = 0;
        public List<String> generateParenthesis(int n) {
            sz = n * 2;
            path = new char[sz];
            dfs(0, 0);
            return res;
        }

        private void dfs(int i, int left) {
            if (i == sz) {
                res.add(new String(path));
                return;
            }
            if (left < sz / 2) {
                path[i] = '(';
                dfs(i + 1, left + 1);
            }
            if (left * 2 > i) {
                path[i] = ')';
                dfs(i + 1, left);
            }
        }
    }
}
