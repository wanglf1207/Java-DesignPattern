package com.designpattern.structural.proxy.v2;
/*
 * ���û��Tank���Դ�����ʹ�ü̳еķ�ʽ���㷽��
 * ������ʱ��
 * Tank2�൱��Tank��һ���������ü̳�ʵ�ִ�����Ӧ�����Ե÷ǳ��ı�Ť
 * ˵����Tank2�Ǽ�¼ʱ��Ĵ�����ʵ��Ӧ���п����м��Ȩ�ޡ���¼��־�ȵ�..
 * ������ȼ�¼ʱ���ڼ��Ȩ����Ҫ����һ�������̳�Tank2,���������ʹ����������
 * ���ԾۺϷ�ʽҪ�ȼ̳кá�
 */
public class Tank2 extends Tank {

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		super.move();
		long endTime = System.currentTimeMillis();
		System.out.println("�������е�ʱ��:"+(endTime-startTime));
	}
	
}
