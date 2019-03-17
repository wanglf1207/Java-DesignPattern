package com.designpattern.behavioral.chainofresp.v3;

public class HTMLFilter implements Filter {

	@Override
	public String doFilter(String str) {
		String result = str.replace('<', '[').replace('>', ']');
		return result;
	}

}
