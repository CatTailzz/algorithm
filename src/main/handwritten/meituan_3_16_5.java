package handwritten;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/16
 * @Copyright: https://github.com/CatTailzz
 */
public class meituan_3_16_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] pre = new int[n];
        int[] suf = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        long sum = 0;
        TreeSet<int[]> ts = new TreeSet<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i = n - 1; i >= 0; i--) {
            int[] ceiling = ts.floor(new int[]{a[i], i});
            if (ceiling != null) {
                int m = ts.size();
                System.out.println(ceiling[0]);
            }
            ts.add(new int[]{a[i], i});
        }
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    cnt++;
                }
            }
            sum += cnt;
            pre[i] = cnt;
        }

        for (int i = n - 1; i >= 0; i--) {
            int cnt = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] < a[i]) {
                    cnt++;
                }
            }
            suf[i] = cnt;
        }

        for (int i = 0; i < n; i++) {
            long res = sum + suf[i] - pre[i];
//            System.out.print(res + " ");
        }
    }
}
