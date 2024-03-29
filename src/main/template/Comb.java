package template;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/15
 * @Copyright: https://github.com/CatTailzz
 */
public class Comb {
    long C(int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        }
        return C(n - 1, m - 1) + C(n - 1, m);
    }
}
