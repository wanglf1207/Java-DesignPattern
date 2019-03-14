package com.designpattern.creative.factory.commonfactory;

public class FTPSender implements ISender {

	@Override
	public void send() {
		System.out.println("FTPSender send...");
	}

}
