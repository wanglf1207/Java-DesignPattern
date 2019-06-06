package com.designpattern.creative.factory.commonfactory;
import org.junit.Test;


/**
 *
 * @author wanglf1207
 * 
 */
public class CommonFactoryPatternTest {

	@Test
	public void testSend() {
		
		SenderFactory senderFactory = new SenderFactory();
		
		senderFactory.produce("TCP").send();
		senderFactory.produce("FTP").send();
		senderFactory.produce("HTTP").send();
	}
}
