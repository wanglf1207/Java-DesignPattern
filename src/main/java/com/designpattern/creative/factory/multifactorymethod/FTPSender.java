package com.designpattern.creative.factory.multifactorymethod;

public class FTPSender implements Sender {

	@Override
	public void send() {
		System.out.println("FTPSender send...");
	}

}
