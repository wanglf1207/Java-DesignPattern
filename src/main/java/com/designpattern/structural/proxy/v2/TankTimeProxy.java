package com.designpattern.structural.proxy.v2;
//һ����������һ��Ķ��󣬽оۺ�
public class TankTimeProxy implements IMoveable {
	//Tank3�൱��Tank��һ������
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
		System.out.println("�������е�ʱ��:"+(endTime-startTime));
	}
}
