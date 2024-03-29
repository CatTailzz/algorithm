package template;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/15
 * @Copyright: https://github.com/CatTailzz
 */
public class UnionFind {
    private int n;
    private int[] fa;

    public UnionFind() {
        n = 1005;
        fa = new int[n];
        for (int i = 0; i < n; i++) {
            fa[i] = i;
        }
    }

    private int find(int u) {
        if (u == fa[u]) {
            return u;
        }
        fa[u] = find(fa[u]);
        return fa[u];
    }

    // add v -> u
    private void join(int u, int v) {
        u = find(u);
        v = find(v);
        if (u == v) {
            return;
        }
        fa[v] = u;
    }

    private Boolean same(int u, int v) {
        u = find(u);
        v = find(v);
        return u == v;
    }
}
