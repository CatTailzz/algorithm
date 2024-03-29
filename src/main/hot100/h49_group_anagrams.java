package hot100;

import java.util.*;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/23
 * @Copyright: https://github.com/CatTailzz
 */
public class h49_group_anagrams {
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String s : strs) {
                char[] value = s.toCharArray();
                Arrays.sort(value);
                String key = new String(value);
                List<String> list = map.getOrDefault(key, new ArrayList<>());
                list.add(s);
                map.put(key, list);
            }
            return new ArrayList<List<String>>(map.values());
        }
    }
}
