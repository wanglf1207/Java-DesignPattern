package com.designpattern.behavioral.chainofresp.v2;

public class SesitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {

		String result = str.replace("被就业","就业");
		return result;
	}

}
