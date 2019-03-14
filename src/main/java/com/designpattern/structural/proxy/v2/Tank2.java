package com.designpattern.structural.proxy.v2;
/*
 * 如果没有Tank类的源码可以使用继承的方式计算方法
 * 的运行时间
 * Tank2相当于Tank的一个代理，利用继承实现代理在应用中显得非常的别扭
 * 说明：Tank2是记录时间的代理，在实际应用中可以有检查权限、记录日志等等..
 * 如果想先记录时间在检查权限又要新增一个类来继承Tank2,如果需求多会使类无限增长
 * 所以聚合方式要比继承好。
 */
public class Tank2 extends Tank {

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		super.move();
		long endTime = System.currentTimeMillis();
		System.out.println("方法运行的时间:"+(endTime-startTime));
	}
	
}
