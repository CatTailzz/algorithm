package hot100;

import java.util.Stack;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/16
 * @Copyright: https://github.com/CatTailzz
 */
public class h155_min_stack {
    class MinStack {
        private Stack<int[]> st;
        public MinStack() {
            st = new Stack<>();
        }

        public void push(int val) {
            int min = st.isEmpty() ? 0 : st.peek()[1];
            min = Math.min(min, val);
            st.push(new int[]{val, min});
        }

        public void pop() {
            st.pop();
        }

        public int top() {
            return st.peek()[0];
        }

        public int getMin() {
            return st.peek()[1];
        }
    }
}
