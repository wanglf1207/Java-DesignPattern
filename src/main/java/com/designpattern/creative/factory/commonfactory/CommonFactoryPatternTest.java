package com.designpattern.creative.factory.commonfactory;

/**
 * 普通工厂模式测试类
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
