package com.designpattern.creative.factory.multifactorymethod;

public class HTTPSender implements ISender {

	@Override
	public void send() {
		System.out.println("HTTPSender send...");
	}

}
