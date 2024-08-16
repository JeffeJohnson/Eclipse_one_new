package org.name;

import org.testng.annotations.Test;

public class Sampleone {
	@Test(groups="smoke")
	public void tc11() {
		System.out.println("TEST 11");

	}
	@Test(groups="sanity")
	public void tc12() {
		System.out.println("TEST 12");

	}
}
