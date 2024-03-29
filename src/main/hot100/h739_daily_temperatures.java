package hot100;

import java.util.Stack;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/16
 * @Copyright: https://github.com/CatTailzz
 */
public class h739_daily_temperatures {
    class Solution {
        //降序的stack，存储{index,val}
        public int[] dailyTemperatures(int[] temperatures) {
            Stack<int[]> st = new Stack<int[]>();
            int n = temperatures.length;
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                int k = temperatures[i];
                if (st.isEmpty() || st.peek()[1] >= k) {
                    st.push(new int[]{i, k});
                } else {
                    while (!st.isEmpty() && st.peek()[1] < k) {
                        var top = st.pop();
                        res[top[0]] = i - top[0];
                    }
                    st.push(new int[]{i, k});
                }
            }
            return res;
        }
    }
}
