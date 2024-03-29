package handwritten;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/17
 * @Copyright: https://github.com/CatTailzz
 */
public class lock {
    static class AwaitSignal extends ReentrantLock {
        public void start(Condition first) {
            this.lock();
            try {
                first.signal();
            } finally {
                this.unlock();
            }
        }
        public void print(String str, Condition current, Condition next) {
            for (int i = 0; i < loopNumber; i++) {
                this.lock();
                try {
                    current.await();
                    System.out.println(str);
                    next.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    this.unlock();
                }
            }
        }
        // 循环次数
        private int loopNumber;
        public AwaitSignal(int loopNumber) {
            this.loopNumber = loopNumber;
        }
    }

    public static void main(String[] args) {
        AwaitSignal as = new AwaitSignal(5);
        Condition aWaitSet = as.newCondition();
        Condition bWaitSet = as.newCondition();
        Condition cWaitSet = as.newCondition();
        new Thread(() -> {
            as.print("a", aWaitSet, bWaitSet);
        }).start();
        new Thread(() -> {
            as.print("b", bWaitSet, cWaitSet);
        }).start();
        new Thread(() -> {
            as.print("c", cWaitSet, aWaitSet);
        }).start();
        as.start(aWaitSet);
    }

}
