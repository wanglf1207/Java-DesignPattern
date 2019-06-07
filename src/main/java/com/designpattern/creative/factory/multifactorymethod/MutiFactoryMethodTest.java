package com.designpattern.creative.factory.multifactorymethod;

import org.junit.Test;

public class MutiFactoryMethodTest {

	@Test
	public void testSend() {
		
		SenderFactory senderFactory = new SenderFactory();
		senderFactory.getFTPSender().send();
		senderFactory.getTCPSender().send();
		senderFactory.getHTTPSender().send();
	}
}
