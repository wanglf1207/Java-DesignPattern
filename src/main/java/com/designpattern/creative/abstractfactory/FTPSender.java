package com.designpattern.creative.abstractfactory;

public class FTPSender implements Sender {

	@Override
	public void send() {
		System.out.println("FTPSender send...");
	}

}
