package swordoffer;

import java.util.Locale;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/20
 * @Copyright: https://github.com/CatTailzz
 */
public class ThreadLocalTest {

    public static ThreadLocal<String> local = new ThreadLocal<>();

    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                local.set("1");
//                System.out.println(local.get());
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                local.set("2");
//                System.out.println(local.get());
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                local.set("3");
//                System.out.println(local.get());
//            }
//        }).start();
        final ThreadLocal threadLocal = new InheritableThreadLocal();
        // 主线程
        threadLocal.set("不擅技术");
        //子线程
        Thread t = new Thread() {
            @Override
            public void run() {
                while(true) {
                    super.run();
                    System.out.println("鄙人三某 ，" + threadLocal.get());
                }

            }
        };
        t.start();
        threadLocal.set("222");
//        t.start();
    }
}
