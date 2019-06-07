package com.designpattern.creative.abstractfactory;

import org.junit.Test;

public class AbstractFactoryTest {
	@Test
	public void testTCPSend() {
		Provider provider = new TCPSenderFactory();
		Sender tcpSender = provider.produce();
		tcpSender.send();
	}
	@Test
	public void testHTTPSend() {
		Provider provider = new HTTPSenderFactory();
		Sender httpSender = provider.produce();
		httpSender.send();
	}
}
