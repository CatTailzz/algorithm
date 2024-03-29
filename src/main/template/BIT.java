package template;

import java.util.Arrays;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/24
 * @Copyright: https://github.com/CatTailzz
 */
public class BIT {
    private int[] tree;
    private int n;

    public BIT(int[] tree, int n) {
        this.tree = tree;
        this.n = n;
    }

    private int lowbit(int x) {
        return x & (-x);
    }

    public int query(int x) {
        int res = 0;
        while (x != 0) {
            res += tree[x];
            x -= lowbit(x);
        }
        return res;
    }

    public void update(int x) {
        while (x <= n) {
            tree[x]++;
            x += lowbit(x);
        }
    }

}
