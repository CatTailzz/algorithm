package hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/16
 * @Copyright: https://github.com/CatTailzz
 */
public class h131_palindrome_partitioning {

    class Solution {
        private List<List<String>> res = new ArrayList<>();
        private List<String> path = new ArrayList<>();
        String s;


        public List<List<String>> partition(String s) {
            this.s = s;
            dfs(0);
            return res;
        }

        private boolean check(int l, int r) {
            while (l < r) {
                if(s.charAt(l++) != s.charAt(r--)) {
                    return false;
                }
            }
            return true;
        }

        private void dfs(int i) {
            if (i == s.length()) {
                res.add(new ArrayList<>(path));
                return;
            }

            for (int j = i; j < s.length(); j++) {
                if (check(i, j)) {
                    path.add(s.substring(i, j + 1));
                    dfs(j + 1);
                    path.remove(path.size() - 1);
                }
            }
        }
    }
}
