package hot100;

import com.sun.jdi.ArrayReference;

import java.util.*;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/3
 * @Copyright: https://github.com/CatTailzz
 */
public class h207_course_schedule {

    class Solution {
        private int[] topoSort(int k, int[][] edges) {
            List<Integer>[] g = new ArrayList[k];
            Arrays.setAll(g, e -> new ArrayList<>());
            var indeg = new int[k];
            for (var e : edges) {
                int y = e[0], x = e[1];
                g[x].add(y);
                indeg[y]++;
            }

            List<Integer> order = new ArrayList<>();
            Queue<Integer> q = new ArrayDeque<>();
            for (int i = 0; i < k; i++) {
                if (indeg[i] == 0) {
                    q.offer(i);
                }
            }
            while (!q.isEmpty()) {
                var x = q.poll();
                order.add(x);
                for (var y : g[x]) {
                    if (--indeg[y] == 0) {
                        q.offer(y);
                    }
                }
            }
            if (k != order.size()) {
                return new int[0];
            }
            return order.stream().mapToInt(e -> e).toArray();


        }

        public boolean canFinish(int numCourses, int[][] prerequisites) {
            if (topoSort(numCourses, prerequisites).length == 0) {
                return false;
            }
            return true;
        }
    }
}
