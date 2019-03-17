/**
 * @(#)Main.java
 * 测试类
 */
package com.designpattern.behavioral.chainofresp.v2;

/**
 * @author wlf
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String msg = "<script>,:),  被就业,";

		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		String str = mp.process();
		System.out.println(str);
	}
}
