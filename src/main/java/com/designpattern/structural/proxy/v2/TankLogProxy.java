package com.designpattern.structural.proxy.v2;
//日志的代理类
public class TankLogProxy implements IMoveable {
	Tank t;
	//TankLogProxy相当于Tank的一个代理
	public TankLogProxy(Tank t) {
		super();
		this.t = t;
	}
	
	@Override
	public void move() {
		System.out.println("Tank start.....");
		t.move();
		System.out.println("Tank end.......");	
	}
}
