package com.designpattern.structural.proxy.demo;

public class ProxyTest {
	
	public static void main(String[] args) {
		
		// �����ô���
		Source s = new Source();
		s.method();
		
		// ʹ�ô��������ܰ����������������
		Proxy p = new Proxy();
		p.method();
	}
}
