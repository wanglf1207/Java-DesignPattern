package com.designpattern.structural.proxy.v2;
//��־�Ĵ�����
public class TankLogProxy implements IMoveable {
	Tank t;
	//TankLogProxy�൱��Tank��һ������
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
