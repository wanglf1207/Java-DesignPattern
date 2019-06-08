package com.designpattern.creative.factory.commonfactory;

 class SenderFactory {
	
	/**
	 * @param protocolType 协议类型
	 */
	 Sender produce(String protocolType) {

		switch (protocolType) {
			case "TCP":
				return new TCPSender();
			case "FTP":
				return new FTPSender();
			case "HTTP":
				return new HTTPSender();
			default:
				System.out.println("请输入合适的类型");
				break;
		}
		return  null;
	}
}
