package com.designpattern.behavioral.chainofresp.v3;

public class FaceFilter implements Filter {

	@Override
	public String doFilter(String str) {
		
		return str.replace(":)","^v^");
	}

}
