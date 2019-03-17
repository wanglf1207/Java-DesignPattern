package com.designpattern.behavioral.chainofresp.v3;

public class SesitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		String result = str.replaceAll("被就业", "就业").replace("敏感", "");
		return result;
	}

}
