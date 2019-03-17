/**
 * @(#)MsgProcessor.java
 */
package com.designpattern.behavioral.chainofresp.v2;

/**
 * @author wlf
 * 处理字符串的类
 */
public class MsgProcessor {
	private String msg;
	Filter[] filters = {new HTMLFilter(),new SesitiveFilter(),new FaceFilter()};
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return
	 */
	public String process() {
		String result = msg;
		for(Filter f:filters) {
			result = f.doFilter(result);
		}
		return result;
	}

}
