package template;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/16
 * @Copyright: https://github.com/CatTailzz
 */
public class GCD {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
