package swordoffer;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/26
 * @Copyright: https://github.com/CatTailzz
 */
public class twoStop {

    private Thread thread;

    public void start(){
        thread = new Thread(() -> {
            while(true) {
                Thread current = Thread.currentThread();
                if (current.isInterrupted()) {
                    System.out.println("ending");
                    break;
                }
                try {
                    Thread.sleep(1000);
                    System.out.println("saving");
                } catch (InterruptedException e) {
                    current.interrupt();
                }
            }
        });
        thread.start();
    }

    public void stop(){
        thread.interrupt();
    }
}
