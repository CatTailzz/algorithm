package swordoffer;

import java.util.Stack;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/23
 * @Copyright: https://github.com/CatTailzz
 */
public class StacktoQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public StacktoQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x){
        s1.push(x);
    }

    public int pop(){
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    public int peek(){
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }


}
