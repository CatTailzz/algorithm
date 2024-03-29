package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/23
 * @Copyright: https://github.com/CatTailzz
 */
public class h438_find_all_anagrams_in_a_string {

    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int sLen = s.length(), pLen = p.length();
            List<Integer> list = new ArrayList<>();
            if (sLen < pLen) {
                return list;
            }

            int[] sMap = new int[26], pMap = new int[26];
            for (int i = 0; i < p.length(); i++) {
                pMap[p.charAt(i) - 'a']++;
            }

            for (int i = 0; i < s.length(); i++) {
                sMap[s.charAt(i) - 'a']++;
                if (i + 1 >= pLen) {
                    if (Arrays.equals(sMap, pMap)) {
                        list.add(i - pLen + 1);
                    }
                    sMap[s.charAt(i - pLen + 1) - 'a']--;
                }
            }
            return list;
        }
    }
}
