package com.designpattern.creative.factory.commonfactory;

public class HTTPSender implements Sender {

	@Override
	public void send() {
		System.out.println("HTTPSender send...");
	}

}
