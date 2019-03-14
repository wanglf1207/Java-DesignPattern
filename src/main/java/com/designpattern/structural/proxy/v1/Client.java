package com.designpattern.structural.proxy.v1;
/**
 * 测试类，模拟Tank类的客户端
 * @author wanglf1207
 */
public class Client {
	public static void main(String[] args) {
		IMoveable m = new Tank();
		m.move();
	}
}
