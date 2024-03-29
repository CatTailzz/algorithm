package template;


import java.util.*;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/15
 * @Copyright: https://github.com/CatTailzz
 */
public class Euler {
    static int MX = 1_000_000_00;
    static List<Integer> primes = new ArrayList<>();

    public static void init() {
        boolean[] np = new boolean[MX + 1];
        for (int i = 2; i <= MX; i++) {
            if (!np[i]) {
                primes.add(i);
            }
            for (int p : primes) {
                if (i * p > MX) {
                    break;
                }
                np[i * p] = true;
                if (i % p == 0) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();
        init();
        while (q-- > 0) {
            int x = in.nextInt();
            System.out.println(primes.get(x - 1));
        }
    }
}
