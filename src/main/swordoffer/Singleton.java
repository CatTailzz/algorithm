package swordoffer;

import java.awt.image.VolatileImage;

/**
 * @description: 手写单例模式
 * @author：CatTail
 * @date: 2024/3/22
 * @Copyright: https://github.com/CatTailzz
 */
public final class Singleton {
    private static volatile Singleton instance;

    private Singleton(){};

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}