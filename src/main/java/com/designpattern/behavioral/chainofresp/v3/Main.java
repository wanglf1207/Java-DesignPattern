/**
 * @ (#)Main.java
 * 链式模糊的测试类
 */
package com.designpattern.behavioral.chainofresp.v3;

/**
 * @author wlf
 * @since  09/12/16
 * 极限编程中推荐先写测试，再写实现类。
 */
public class Main {

	public static void main(String[] args) {

		String msg = "大家好:),<script>,被就业，我是程序员";

		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
				.addFilter(new SesitiveFilter());

		mp.setFc(fc);

		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new FaceFilter());
		fc.addFilter(fc2);//能这么些的唯一的做法就是FilterChain也实现Filter这个接口!
		fc.addFilter(new InsertStringFilter());
		String rusult = mp.process();
		System.out.println(rusult);
	}
}
