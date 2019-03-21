package com.designpattern.behavioral.chainofresp.v4;

public class SesitiveFilter implements Filter {
	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		request.requestStr = request.requestStr.replace('<', '[').replace('>', ']')+"---SesitiveFilter";
		chain.doFilter(request, response, chain);
		response.responseStr += "---SesitiveFilter()";
	}

}
