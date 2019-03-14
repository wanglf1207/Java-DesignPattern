package com.designpattern.structural.proxy.v4;
//�����࣬ģ��Tank��Ŀͻ���
public class Client {
	public static void main(String[] args) throws Exception {
		Tank t = new Tank();
		
		IMoveable m = (IMoveable)Proxy.newProxyInstance(IMoveable.class);
		
		m.move();
	}
}