package swordoffer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/23
 * @Copyright: https://github.com/CatTailzz
 */
public class QuetoStack {

    Deque<Integer> que;

    public QuetoStack(){
        que = new ArrayDeque<>();
    }

    public void push(int x) {
        que.offer(x);
    }

    public int pop() {
        int n = que.size();
        while (n-- > 1) {
            que.offer(que.poll());
        }
        return que.poll();
    }

    public int top() {
        return que.peekLast();
    }

    public boolean empty() {
        return que.isEmpty();
    }
}
