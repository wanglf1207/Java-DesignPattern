package com.designpattern.structural.proxy.v4;
//测试类，模糊Tank类的客户端
public class Client {
	public static void main(String[] args) throws Exception {
		Tank t = new Tank();

		IMoveable m = (IMoveable)Proxy.newProxyInstance(IMoveable.class);

		m.move();
	}
}