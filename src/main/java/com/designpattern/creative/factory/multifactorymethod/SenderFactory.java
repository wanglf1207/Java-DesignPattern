package com.designpattern.creative.factory.multifactorymethod;

public class SenderFactory {
	
	public ISender getTCPSender() {
		return new TCPSender();
	}
	public ISender getHTTPSender() {
		return new HTTPSender();
	}
	public ISender getFTPSender() {
		return new FTPSender();
	}
}
