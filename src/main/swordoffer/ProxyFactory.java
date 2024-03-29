package swordoffer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 手写代理模式
 * @author：CatTail
 * @date: 2024/3/20
 * @Copyright: https://github.com/CatTailzz
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("begin");
                method.invoke(target, args);
                System.out.println("end");
                return null;
            }
        });
    }

    public static void main(String[] args) {
        IPrint printer = new MyPrint();

        IPrint proxyPrinter = (IPrint) new ProxyFactory(printer).getProxyInstance();

        proxyPrinter.print();
    }
}
