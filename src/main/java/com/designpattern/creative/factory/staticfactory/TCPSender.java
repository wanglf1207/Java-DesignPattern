package com.designpattern.creative.factory.staticfactory;

public class TCPSender implements Sender {

	@Override
	public void send() {
		System.out.println("TCPSender send...");
	}

}
