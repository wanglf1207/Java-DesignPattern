package com.designpattern.creative.abstractfactory;

public class TCPSenderFactory implements Provider {
	
	/**
	 * ��ȡsender
	 */
	@Override
	public Sender getSender() {
		return new TCPSender();
	}
}
