package com.designpattern.creative.factory.staticfactory;

public class StaticFactoryTest {
	
	public static void main(String[] args) {
		
		SenderFactory.getFTPSender().send();
		SenderFactory.getTCPSender().send();
		SenderFactory.getHTTPSender().send();
	}
}
