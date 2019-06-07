package com.designpattern.creative.factory.commonfactory;

public class FTPSender implements Sender {

	@Override
	public void send() {
		System.out.println("FTPSender send...");
	}

}
