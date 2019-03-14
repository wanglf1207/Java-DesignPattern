package com.designpattern.creative.factory.commonfactory;

public class SenderFactory {
	
	/**
	 * @param protocolType Э������
	 */
	public ISender produce(String protocolType) {
		
		if(protocolType.equals("TCP")) {
			return new TCPSender();
		} else if(protocolType.equals("FTP")) {
			return new FTPSender();
		} else if(protocolType.equals("HTTP")) {
			return new HTTPSender();
		} else {
			System.out.println("����Ĳ������Ͳ���ȷ");
			return null;
		}
	}
}
