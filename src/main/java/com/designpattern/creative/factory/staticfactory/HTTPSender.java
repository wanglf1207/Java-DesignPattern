package com.designpattern.creative.factory.staticfactory;

public class HTTPSender implements Sender {

	@Override
	public void send() {
		System.out.println("HTTPSender send...");
	}

}
