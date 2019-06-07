package com.designpattern.creative.abstractfactory;

public class HTTPSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new HTTPSender();
	}
}
