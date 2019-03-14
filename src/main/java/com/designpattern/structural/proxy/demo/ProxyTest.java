package com.designpattern.structural.proxy.demo;

public class ProxyTest {
	
	public static void main(String[] args) {
		
		// 不适用代理
		Source s = new Source();
		s.method();
		
		// 使用代理，代理能帮助我们做更多的事
		Proxy p = new Proxy();
		p.method();
	}
}
