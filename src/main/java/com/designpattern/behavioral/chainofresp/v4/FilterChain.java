/**
 * @(#)FilterChain.java
 * 代表一个整体的过滤链条
 */
package com.designpattern.behavioral.chainofresp.v4;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	List<Filter> filters = new ArrayList<Filter>();
	int index = 0;
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;//返回当前链条
	}

	public void doFilter(Request request,Response response,FilterChain chain) {

		if(index == filters.size()) return;
		Filter f = filters.get(index);
		index ++;
		f.doFilter(request, response, chain);
	}
}
