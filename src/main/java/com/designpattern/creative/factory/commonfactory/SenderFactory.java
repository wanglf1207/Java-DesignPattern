package com.designpattern.creative.factory.commonfactory;

public class SenderFactory {
	
	/**
	 * @param protocolType 协议类型
	 */
	public ISender produce(String protocolType) {
		
		if(protocolType.equals("TCP")) {
			return new TCPSender();
		} else if(protocolType.equals("FTP")) {
			return new FTPSender();
		} else if(protocolType.equals("HTTP")) {
			return new HTTPSender();
		} else {
			System.out.println("请输入合适的类型");
			return null;
		}
	}
}
