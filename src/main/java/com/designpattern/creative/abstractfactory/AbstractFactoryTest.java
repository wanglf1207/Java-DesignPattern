package com.designpattern.creative.abstractfactory;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		
		Provider provider = new TCPSenderFactory();
		provider.getSender().send();
	}
}
