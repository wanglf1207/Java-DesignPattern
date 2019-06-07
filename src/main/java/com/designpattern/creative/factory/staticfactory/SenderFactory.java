package com.designpattern.creative.factory.staticfactory;

public class SenderFactory {
	
	public static Sender getTCPSender() {
		return new TCPSender();
	}
	public static Sender getHTTPSender() {
		return new HTTPSender();
	}
	public static Sender getFTPSender() {
		return new FTPSender();
	}
}
