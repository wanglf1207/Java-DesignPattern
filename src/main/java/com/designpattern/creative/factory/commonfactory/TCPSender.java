package com.designpattern.creative.factory.commonfactory;

public class TCPSender implements ISender {

	@Override
	public void send() {
		System.out.println("TCPSender send...");
	}

}
