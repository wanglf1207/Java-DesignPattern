package com.designpattern.structural.proxy.v2;
//一个类中有另一类的对象，叫聚合
public class TankTimeProxy implements IMoveable {
	//Tank3相当于Tank的一个代理
	public TankTimeProxy(Tank t) {
		super();
		this.t = t;
	}
	Tank t;
	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		t.move();
		long endTime = System.currentTimeMillis();
		System.out.println("方法运行的时间:"+(endTime-startTime));
	}
}
