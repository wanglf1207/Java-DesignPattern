package com.designpattern.structural.proxy.invocationhandler;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String [] args) {

        // 要代理的真实对象
        Subject tenant = new Tenant();

        // 我们要代理那个真实对象，就将那个对象传进去，最后是通过该真实对象调用其方法的
        InvocationHandler handler = new LogHandler(tenant);

        /*
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
         * 第二个参数realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
         */
       Subject proxyInstance = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), tenant
                .getClass().getInterfaces(), handler);
        System.out.println(proxyInstance.getClass().getName());
        proxyInstance.rent();


    }
}
