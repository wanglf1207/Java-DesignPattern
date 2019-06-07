package com.designpattern.creative.factory.multifactorymethod;

public class HTTPSender implements Sender {

	@Override
	public void send() {
		System.out.println("HTTPSender send...");
	}

}
