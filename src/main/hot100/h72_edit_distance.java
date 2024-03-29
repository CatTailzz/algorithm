package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/21
 * @Copyright: https://github.com/CatTailzz
 */
public class h72_edit_distance {
    class Solution {
        public int minDistance(String s, String t) {
            int n = s.length(), m = t.length();
            int[][] dp = new int[n + 1][m + 1];
            for (int i = 0; i < n + 1; i++) dp[i][0] = i;
            for (int j = 0; j < m + 1; j++) dp[0][j] = j;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (s.charAt(i) == t.charAt(j)) {
                        dp[i + 1][j + 1] = dp[i][j];
                    } else {
                        dp[i + 1][j + 1] = Math.min(dp[i][j], Math.min(dp[i][j + 1], dp[i + 1][j])) + 1;
                    }
                }
            }
            return dp[n][m];
        }
    }
}
