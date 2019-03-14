package com.designpattern.structural.proxy.v1;

import java.util.Random;

/**
 * 计算这个方法的运行时间，分别计算开始、结束时间，相减。
 * @author wanglf1207
 */
public class Tank implements IMoveable {
	
	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("tank moving...");
		/**
		 * 睡眠一段时间表示Tank正在移动中。
		 * nextInt,返回下一个伪随机数，
		 * 它是此随机数生成器的序列中均匀分布的 int 值。
		 */
		try {
			//产生10秒以内的随机数
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("方法运行的时间:"+(endTime-startTime));
	}
}
