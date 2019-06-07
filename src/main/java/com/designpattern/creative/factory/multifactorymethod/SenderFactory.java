package com.designpattern.creative.factory.multifactorymethod;

public class SenderFactory {
	public Sender getTCPSender() {
		return new TCPSender();
	}
	public Sender getHTTPSender() {
		return new HTTPSender();
	}
	public Sender getFTPSender() { return new FTPSender(); }
}
