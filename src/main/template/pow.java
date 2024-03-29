package template;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/15
 * @Copyright: https://github.com/CatTailzz
 */
public class pow {
    long pow(long x, long n) {
        long res = 1;
        for (; n > 0; n /= 2) {
            if (n % 2 != 0) {
                res = res * x;
            }
            x = x * x;
        }
        return res;
    }
}
