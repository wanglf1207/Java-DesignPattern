package com.designpattern.structural.proxy.v1;

import java.util.Random;

/**
 * �����������������ʱ�䣬�ֱ���㿪ʼ������ʱ�䣬�����
 * @author wanglf1207
 */
public class Tank implements IMoveable {
	
	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("tank moving...");
		/**
		 * ˯��һ��ʱ���ʾTank�����ƶ��С�
		 * nextInt,������һ��α�������
		 * ���Ǵ�������������������о��ȷֲ��� int ֵ��
		 */
		try {
			//����10�����ڵ������
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("�������е�ʱ��:"+(endTime-startTime));
	}
}
