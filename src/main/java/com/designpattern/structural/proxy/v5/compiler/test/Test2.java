package com.designpattern.structural.proxy.v5.compiler.test;

import java.lang.reflect.Method;

import com.designpattern.structural.proxy.v5.proxy.Moveable;

public class Test2 {
	public static void main(String[] args) {
		Method[] methods = Moveable.class.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}
}
