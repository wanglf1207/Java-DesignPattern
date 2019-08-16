package com.designpattern.structural.proxy.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

    private Object subbject;

    public LogHandler(Object subbject) {
        this.subbject = subbject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object ret = new Object();
        // 在代理真实对象前我们可以加一些自己的操作
        System.out.println("租房前准备房租....");

        System.out.println("Method : " + method);

        ret =  method.invoke(subbject,args);

        // 在代理真实对象执行后我们可以加一些自己的操作
        System.out.println("租房后买点日用品....");
        return ret;
    }
}
