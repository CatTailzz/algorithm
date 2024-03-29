package hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/15
 * @Copyright: https://github.com/CatTailzz
 */
public class h17_letter_combinations_of_a_phone_number {
    class Solution {
        private final String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        private List<String> res = new ArrayList<>();
        private char[] digits;
        private char[] path;

        public List<String> letterCombinations(String digits) {
            int n = digits.length();
            if (n == 0) {
                return res;
            }
            this.digits = digits.toCharArray();
            path = new char[n];
            dfs(0);
            return res;
        }

        private void dfs(int i) {
            if (i == digits.length) {
                res.add(path.toString());
                return;
            }
            for (char c : map[digits[i]].toCharArray()) {
                path[i] = c;
                dfs(i + 1);
            }
        }
    }
}
