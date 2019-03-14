package com.designpattern.creative.abstractfactory;

public class HTTPSenderFactory implements Provider {
	
	/**
	 * ��ȡsender
	 */
	@Override
	public Sender getSender() {
		return new HTTPSender();
	}
}
