package com.designpattern.structural.proxy.v3;
//一个类中有另一类的对象，叫聚合
public class TankTimeProxy implements IMoveable {

	IMoveable t;

	public TankTimeProxy(IMoveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		t.move();
		long endTime = System.currentTimeMillis();
		System.out.println("方法运行的时间:"+(endTime-startTime));
	}
}
