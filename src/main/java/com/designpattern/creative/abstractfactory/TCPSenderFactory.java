package com.designpattern.creative.abstractfactory;

public class TCPSenderFactory implements Provider {
	
	/**
	 * »ñÈ¡sender
	 */
	@Override
	public Sender getSender() {
		return new TCPSender();
	}
}
