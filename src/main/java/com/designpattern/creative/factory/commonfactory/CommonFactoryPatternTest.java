package com.designpattern.creative.factory.commonfactory;

/**
 * ��ͨ����ģʽ������
 * @author wanglf1207
 * 
 */
public class CommonFactoryPatternTest {
	
	public static void main(String[] args) {
		
		SenderFactory senderFactory = new SenderFactory();
		
		senderFactory.produce("TCP").send();
		senderFactory.produce("FTP").send();
		senderFactory.produce("HTTP").send();
	}
}
