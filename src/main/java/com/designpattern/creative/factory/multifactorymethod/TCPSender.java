package com.designpattern.creative.factory.multifactorymethod;

public class TCPSender implements ISender {

	@Override
	public void send() {
		System.out.println("TCPSender send...");
	}

}
