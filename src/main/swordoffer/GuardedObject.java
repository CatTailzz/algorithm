package swordoffer;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/26
 * @Copyright: https://github.com/CatTailzz
 */
public class GuardedObject {

    private Object response;

    private final Object lock = new Object();

    public Object get() {
        synchronized (lock) {
            while (response == null) {
                try {
                    lock.wait();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return response;
        }
    }

    public void complete(Object response) {
        synchronized (lock) {
            this.response = response;
            lock.notifyAll();
        }
    }
}
