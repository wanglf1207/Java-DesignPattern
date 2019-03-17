package com.designpattern.behavioral.chainofresp.v3;

public class InsertStringFilter implements Filter{

	@Override
	public String doFilter(String str) {
		return str.replace("程序员", "优秀程序员");
	}
}
