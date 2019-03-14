package com.designpattern.structural.proxy.v3;
//һ����������һ��Ķ��󣬽оۺ�
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
		System.out.println("�������е�ʱ��:"+(endTime-startTime));
	}
}
