/**
 * @(#)Main.java
 */
package com.designpattern.behavioral.chainofresp.v4;
/**
 * @author wlf
 * @since  09/12/16
 * 极限编程中推荐先写测试，再写实现类。
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String msg = "大家好:),<script>,被就业，我是程序员";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");

		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
				.addFilter(new SesitiveFilter());

		fc.doFilter(request, response,fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}
}
