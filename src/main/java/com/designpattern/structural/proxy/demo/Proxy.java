package com.designpattern.structural.proxy.demo;

public class Proxy implements Sourceable {

	private Source source;
	
	public Proxy() {
		this.source = new Source();
	}
	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	
	public void before() {
		System.out.println("Proxy before....");
	}
	
	public void after() {
		System.out.println("Proxy after....");
	}

}
