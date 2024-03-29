package template;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/3
 * @Copyright: https://github.com/CatTailzz
 */
public class topoSort {

    int[] topoSort(int k, int[][] edges) {
        List<Integer>[] g = new ArrayList[k];
        Arrays.setAll(g, e -> new ArrayList<>());
        var inDeg = new int[k];
        for (var e : edges) {
            int x = e[0] - 1, y = e[1] - 1;
            g[x].add(y);
            ++inDeg[y];
        }

        var order =  new ArrayList<Integer>();
        var q = new ArrayDeque<Integer>();
        for (int i = 0; i < k; i++) {
            if (inDeg[i] == 0) {
                q.push(i);
            }
        }

        while (!q.isEmpty()) {
            var x = q.pop();
            order.add(x);
            for (var y : g[x]) {
                if (--inDeg[y] == 0) {
                    q.push(y);
                }
            }
        }
        if (k != order.size()) {
            return new int[0];
        }
        return order.stream().mapToInt(x -> x).toArray();
    }
}
