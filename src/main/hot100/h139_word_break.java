package hot100;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/21
 * @Copyright: https://github.com/CatTailzz
 */
public class h139_word_break {
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            int n = s.length();
            int[] dp = new int[n + 1];
            dp[0] = 1;
            Set<String> set = new HashSet<>(wordDict);
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] == 1 && set.contains(s.substring(j, i))) {
                        dp[i] = 1;
                        break;
                    }
                }
            }
            return dp[n] == 1;
        }
    }
}
