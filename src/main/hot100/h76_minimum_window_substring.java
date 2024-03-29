package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/25
 * @Copyright: https://github.com/CatTailzz
 */
public class h76_minimum_window_substring {

    static class Solution {
        public String minWindow(String s, String t) {
            Map<Character, Integer> hs = new HashMap<>();
            Map<Character, Integer> ht = new HashMap<>();
            for (int i = 0; i < t.length(); i++) {
                ht.put(t.charAt(i), ht.getOrDefault(t.charAt(i), 0) + 1);
            }
            String res = "";
            int cnt = 0, len = 0x3f3f3f3f;
            for (int i = 0, j = 0; i < s.length(); i++) {
                hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
                if (ht.containsKey(s.charAt(i)) && hs.get(s.charAt(i)) <= ht.get(s.charAt(i))) {
                    cnt++;
                }
                while (j < i && (!ht.containsKey(s.charAt(j)) || hs.get(s.charAt(j)) > ht.get(s.charAt(j)))) {
                    int count = hs.get(s.charAt(j)) - 1;
                    hs.put(s.charAt(j), count);
                    j++;
                }
                if (cnt == t.length() && i - j + 1 < len) {
                    len = i - j + 1;
                    res = s.substring(j, i + 1);
                }

            }
            return res;
        }
    }
}
