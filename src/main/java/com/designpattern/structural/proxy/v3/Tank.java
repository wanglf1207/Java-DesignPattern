package com.designpattern.structural.proxy.v3;

import java.util.Random;

public class Tank implements IMoveable {
	
	/**
	 * 计算这个方法的运行时间，分别计算开始结束时间，相减。
	 */
	@Override
	public void move() {
		
		System.out.println("tank moving...");
		/**
		 * 睡眠一段时间表示Tank正在移动中。
		 * nextInt,返回下一个伪随机数，
		 * 它是此随机数生成器的序列中均匀分布的 int 值。
		 */
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
