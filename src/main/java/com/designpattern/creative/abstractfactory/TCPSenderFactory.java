package com.designpattern.creative.abstractfactory;

public class TCPSenderFactory implements Provider {
	
	@Override
	public Sender produce() {
		return new TCPSender();
	}
}
