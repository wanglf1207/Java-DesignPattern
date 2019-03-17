package com.designpattern.behavioral.chainofresp.v3;

public class MsgProcessor {
	private String msg;

	//Filter[] filters = {new HTMLFilter(),new SesitiveFilter(),new FaceFilter()};
	FilterChain fc; // 过滤链条
	public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String process() {

		return fc.doFilter(msg);
	}
}
