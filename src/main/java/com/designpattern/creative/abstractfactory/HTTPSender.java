package com.designpattern.creative.abstractfactory;

public class HTTPSender implements Sender {

	@Override
	public void send() {
		System.out.println("HTTPSender send...");
	}

}
