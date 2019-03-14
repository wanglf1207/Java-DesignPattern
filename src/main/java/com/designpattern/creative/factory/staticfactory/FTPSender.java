package com.designpattern.creative.factory.staticfactory;

public class FTPSender implements ISender {

	@Override
	public void send() {
		System.out.println("FTPSender send...");
	}

}
