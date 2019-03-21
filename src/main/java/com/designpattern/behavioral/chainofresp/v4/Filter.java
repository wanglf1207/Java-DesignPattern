package com.designpattern.behavioral.chainofresp.v4;

/**
 * @author wlf
 *
 */
public interface Filter {
	
	void doFilter(Request request, Response response, FilterChain chain);
}
