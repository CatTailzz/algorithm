package hot100;

import java.util.*;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/25
 * @Copyright: https://github.com/CatTailzz
 */
public class h56_merge_intervals {

    static class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
            int st = -1, ed = -1;
            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < intervals.length; i++) {
                int l = intervals[i][0], r = intervals[i][1];
                if (l <= ed) {
                    ed = Math.max(ed, r);
                } else {
                    if (st != -1) {
                        list.add(new int[]{st, ed});
                    }
                    st = l;
                    ed = r;
                }
            }
            list.add(new int[]{st, ed});
            return list.toArray(new int[list.size()][]);
        }
    }


}
