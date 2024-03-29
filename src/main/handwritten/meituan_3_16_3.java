package handwritten;

import java.util.*;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/16
 * @Copyright: https://github.com/CatTailzz
 */
public class meituan_3_16_3 {
    private static final int MOD = 1_000_000_007;
    public static long pow(long x, long n) {
        long res = 1;
        for (; n > 0; n /= 2) {
            if (n % 2 == 1) {
                res = (res * x) % MOD;
            }
            x = x * x % MOD;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        int index = 0;
        int del[] = new int[n];
        for (int i = 0; i < q; i++) {
            index = in.nextInt();
            del[index - 1]++;
        }
        //每个元素需要乘上q - del[i]次2
        long res = 0;
        for (int i = 0; i < n; i++) {
            long cj = pow(2L, (long) (q - del[i]));
            res = (res + (cj * a[i] % MOD)) % MOD;
        }
        System.out.println(res);
    }
}
