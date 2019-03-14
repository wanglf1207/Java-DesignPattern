package com.designpattern.structural.proxy.v3;

import java.util.Random;

public class Tank implements IMoveable {
	
	/**
	 * �����������������ʱ�䣬�ֱ���㿪ʼ����ʱ�䣬�����
	 */
	@Override
	public void move() {
		
		System.out.println("tank moving...");
		/**
		 * ˯��һ��ʱ���ʾTank�����ƶ��С�
		 * nextInt,������һ��α�������
		 * ���Ǵ�������������������о��ȷֲ��� int ֵ��
		 */
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
