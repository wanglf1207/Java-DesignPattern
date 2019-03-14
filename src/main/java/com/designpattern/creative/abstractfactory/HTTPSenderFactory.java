package com.designpattern.creative.abstractfactory;

public class HTTPSenderFactory implements Provider {
	
	/**
	 * »ñÈ¡sender
	 */
	@Override
	public Sender getSender() {
		return new HTTPSender();
	}
}
