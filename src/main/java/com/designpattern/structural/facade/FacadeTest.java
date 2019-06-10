package com.designpattern.structural.facade;

import org.junit.Test;

public class FacadeTest {
	@Test
	public void testFacade() {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
