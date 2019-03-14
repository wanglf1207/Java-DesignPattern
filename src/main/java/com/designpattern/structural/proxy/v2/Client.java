package com.designpattern.structural.proxy.v2;
//测试类，模拟Tank类的客户端
public class Client {
	public static void main(String[] args) {
		IMoveable m = new Tank2();
		m.move();
	}
}