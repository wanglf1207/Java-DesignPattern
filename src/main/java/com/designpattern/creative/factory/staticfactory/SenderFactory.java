package com.designpattern.creative.factory.staticfactory;

public class SenderFactory {
	
	public static ISender getTCPSender() {
		return new TCPSender();
	}
	public static ISender getHTTPSender() {
		return new HTTPSender();
	}
	public static ISender getFTPSender() {
		return new FTPSender();
	}
}
