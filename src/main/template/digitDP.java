package template;

import java.util.Arrays;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/29
 * @Copyright: https://github.com/CatTailzz
 */
public class digitDP {
    class Solution {
        private char[] s;
        private int[][] dp;
        public int numDupDigitsAtMostN(int n) {
            s = Integer.toString(n).toCharArray();
            int m = s.length;
            dp = new int[m][1 << 10];
            for (int i = 0; i < m; i++) {
                Arrays.fill(dp[i], -1);
            }
            return n - f1(0, 0, true, false);
        }

        //用mask来表示每一位是否选择
        private int f1(int i, int mask, boolean isLimit, boolean isNum) {
            if (i == s.length) {
                return isNum ? 1 : 0;
            }
            if (!isLimit && isNum && dp[i][mask] != -1) {
                return dp[i][mask];
            }
            int res = 0;
            if (!isNum) {
                res = f1(i + 1, mask, false, false);
            }
            int up = isLimit ? s[i] - '0' : 9;
            for (int d = isNum ? 0 : 1; d <= up; ++d) {
                if ((mask >> d & 1) == 0) {
                    res += f1(i + 1, mask | (1 << d), isLimit && d == up, true);
                }
            }
            if (!isLimit && isNum) {
                dp[i][mask] = res;
            }
            return res;
        }

        //简单统计1的个数
        private int f(int i, int cnt1, boolean isLimit) {
            if (i == s.length) {
                return cnt1;
            }
            if (!isLimit && dp[i][cnt1] >= 0) {
                return dp[i][cnt1];
            }
            int res = 0;
            int up = isLimit ? s[i] - '0' : 9;
            for (int d = 0; d <= up; d++) {
                res += f(i + 1, cnt1 + (d == 1 ? 1 : 0), isLimit && d == up);
            }
            if (!isLimit) {
                dp[i][cnt1] = res;
            }
            return res;
        }
    }
}
