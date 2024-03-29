package swordoffer;

import java.util.concurrent.*;

/**
 * @description: 创建线程的三种方式
 * @author：CatTail
 * @date: 2024/3/23
 * @Copyright: https://github.com/CatTailzz
 */
public class createThread {

    static class threada extends Thread {
        @Override
        public void run() {
            System.out.println("a");
        }
    }

    static class threadb implements Runnable {

        @Override
        public void run() {
            System.out.println("b");
        }
    }

    static class threadc implements Callable {

        @Override
        public Object call() throws Exception {
            return "c";
        }
    }


    public static void main(String[] args) throws Exception {
        threada threada = new threada();
        threadb threadb = new threadb();
        threadc threadc = new threadc();

        threada.run();
        threadb.run();

        FutureTask<String> ft = new FutureTask<>(threadc);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(ft);
        System.out.println(ft.get());
    }
}
