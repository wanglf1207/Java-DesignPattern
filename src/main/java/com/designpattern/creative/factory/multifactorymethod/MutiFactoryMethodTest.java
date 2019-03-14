package com.designpattern.creative.factory.multifactorymethod;

public class MutiFactoryMethodTest {
	
	public static void main(String[] args) {
		
		SenderFactory senderFactory = new SenderFactory();
		senderFactory.getFTPSender().send();
		senderFactory.getTCPSender().send();
		senderFactory.getHTTPSender().send();
	}
}
