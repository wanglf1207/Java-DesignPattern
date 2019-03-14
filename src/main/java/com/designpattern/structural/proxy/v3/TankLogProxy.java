package com.designpattern.structural.proxy.v3;
//��־�Ĵ�����
public class TankLogProxy implements IMoveable {
	
	IMoveable t;
	
	public TankLogProxy(IMoveable t) {
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
