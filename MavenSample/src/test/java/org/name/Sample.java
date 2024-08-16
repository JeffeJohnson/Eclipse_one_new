package org.name;

import org.testng.annotations.Test;

public class Sample {
	@Test(groups="smoke")
	public void tc1() {
		System.out.println(3/0);
		System.out.println("TEST 1");

	}
	@Test(groups="sanity")
	public void tc2() {
		System.out.println("TEST 2");

	}

}
