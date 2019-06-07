package com.designpattern.creative.factory.multifactorymethod;

public class TCPSender implements Sender {

	@Override
	public void send() {
		System.out.println("TCPSender send...");
	}

}
