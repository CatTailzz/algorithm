package hot100;

import java.util.Stack;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/16
 * @Copyright: https://github.com/CatTailzz
 */
public class h20_valid_parentheses {
    class Solution {
        public boolean isValid(String s) {
            char[] dig = s.toCharArray();
            Stack<Character> st = new Stack<>();
            for (char c : dig) {
                if (c == '(') {
                    st.push(')');
                } else if (c == '{') {
                    st.push('}');
                } else if (c == '[') {
                    st.push(']');
                } else {
                    if (!st.isEmpty() && c == st.peek()) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
            return st.size() == 0;
        }
    }
}
