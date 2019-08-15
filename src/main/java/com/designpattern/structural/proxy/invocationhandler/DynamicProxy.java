package com.designpattern.structural.proxy.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object subbject;

    public DynamicProxy(Object subbject) {
        this.subbject = subbject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 在代理真实对象前我们可以加一些自己的操作
        System.out.println("before rent house");

        System.out.println("Method : " + method);

        method.invoke(subbject,args);

        // 在代理真实对象执行后我们可以加一些自己的操作
        System.out.println("after rent house");
        return null;
    }
}
