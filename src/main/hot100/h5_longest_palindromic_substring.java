package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/21
 * @Copyright: https://github.com/CatTailzz
 */
public class h5_longest_palindromic_substring {
    class Solution {
        public String longestPalindrome(String s) {
            char[] ss = s.toCharArray();
            int n = ss.length;
            int[][] dp = new int[n + 1][n + 1];
            int l = 0, r = 0, res = 0;
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    if (ss[i] == ss[j]) {
                        if (j - i <= 1) {
                            dp[i][j] = 1;
                        } else {
                            dp[i][j] = dp[i + 1][j - 1];
                        }
                    }
                    if (dp[i][j] == 1 && j - i + 1 >= res) {
                        res = j - i + 1;
                        l = i;
                        r = j;
                    }
                }
            }
            return s.substring(l, r + 1);
        }
    }
}
