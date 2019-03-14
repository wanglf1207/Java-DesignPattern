package com.designpattern.structural.proxy.v3;
//测试类，模糊Tank类的客户端
public class Client {
	public static void main(String[] args) {
		Tank t = new Tank();
		TankTimeProxy ttp = new TankTimeProxy(t);
		TankLogProxy tlp = new TankLogProxy(ttp);
		IMoveable m = tlp;
		m.move();
	}
}
