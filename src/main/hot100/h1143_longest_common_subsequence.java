package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/21
 * @Copyright: https://github.com/CatTailzz
 */
public class h1143_longest_common_subsequence {
    class Solution {
        public int longestCommonSubsequence(String s, String t) {
            int n = s.length(), m = t.length();
            int[][] f = new int[n + 1][m + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    f[i + 1][j + 1] = (s.charAt(i) == t.charAt(j)) ? f[i][j] + 1 : Math.max(f[i][j + 1], f[i + 1][j]);
                }
            }
            return f[n][m];
        }
    }
}
