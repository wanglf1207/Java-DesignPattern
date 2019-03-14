package com.designpattern.creative.abstractfactory;

public class TCPSender implements Sender {

	@Override
	public void send() {
		System.out.println("TCPSender send...");
	}

}
