package IO;

import java.util.*;

public class m {
    public static int find(int x, int[] fa) {
        if (x == fa[x]) {
            return x;
        }
        fa[x] = find(fa[x], fa);
        return fa[x];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] fa = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            fa[i] = i;
        }
        while (m-- > 0) {
            int z = in.nextInt(), x = in.nextInt(), y = in.nextInt();
            if (z == 1) {
                x = find(x, fa);
                y = find(y, fa);
                if (x == y) {
                    continue;
                }
                fa[x] = y;
            } else {
                System.out.println(find(x, fa) == find(y, fa) ? "Y" : "N");
            }
        }
    }
}