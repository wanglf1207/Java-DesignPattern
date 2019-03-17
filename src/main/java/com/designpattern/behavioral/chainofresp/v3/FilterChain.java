/**
 * @ (#)FilterChain.java
 * 代表一个整体的过滤链条
 */
package com.designpattern.behavioral.chainofresp.v3;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<Filter>();

	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;//返回当前链条
	}

	public String doFilter(String str) {
		String r = str;
		for(Filter f:filters) {
			r = f.doFilter(r);
		}
		return r;

	}
}
