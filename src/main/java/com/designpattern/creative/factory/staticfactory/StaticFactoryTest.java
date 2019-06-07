package com.designpattern.creative.factory.staticfactory;

import org.junit.Test;

public class StaticFactoryTest {

	@Test
	public void testSend() {
		SenderFactory.getFTPSender().send();
		SenderFactory.getTCPSender().send();
		SenderFactory.getHTTPSender().send();
	}
}
