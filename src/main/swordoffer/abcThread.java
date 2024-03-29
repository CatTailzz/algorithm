package swordoffer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 交替输出abc
 * @author：CatTail
 * @date: 2024/3/23
 * @Copyright: https://github.com/CatTailzz
 */
public class abcThread {

    static class AwaitSignal extends ReentrantLock {
        public void start(Condition first) {
            this.lock();
            try {
                first.signal();
            } finally {
                this.unlock();
            }
        }

        public void print(String str, Condition before, Condition after) {
            for (int i = 0; i < loopNum; i++) {
                this.lock();
                try {
                    before.await();
                    System.out.print(str);
                    after.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    this.unlock();
                }
            }
        }

        private int loopNum;

        public AwaitSignal(int loopNum) {
            this.loopNum = loopNum;
        }
    }

    public static void main(String[] args) {
        AwaitSignal as = new AwaitSignal(5);
        Condition ac = as.newCondition();
        Condition bc = as.newCondition();
        Condition cc = as.newCondition();
        new Thread(() -> {
            as.print("a", ac, bc);
        }).start();
        new Thread(() -> {
            as.print("b", bc, cc);
        }).start();
        new Thread(() -> {
            as.print("c", cc, ac);
        }).start();
        as.start(ac);

    }

}
