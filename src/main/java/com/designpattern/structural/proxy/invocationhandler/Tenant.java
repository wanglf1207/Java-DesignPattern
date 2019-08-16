package com.designpattern.structural.proxy.invocationhandler;

public class Tenant implements Subject {
    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

}
