package handwritten;

import java.util.*;


public class meituan_3_16_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        int up = 0, low = 0;
        for (char c : s) {
            if (c >= 'a' && c <= 'z') {
                low++;
            } else {
                up++;
            }
        }
        int n = s.length;
        int f = (s[0] >= 'A' && s[0] <= 'Z') ? 0 : 1;
        int res = Math.min(Math.min(low, up) , f + up - (f == 0 ? 1 : 0));
        System.out.println(res);

    }
}