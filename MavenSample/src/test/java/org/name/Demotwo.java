package org.name;

import org.testng.annotations.Test;

public class Demotwo {
	@Test(invocationCount=2)
	public void test11() {
		System.out.println("Test 11");

	}
	@Test(enabled=false)
	public void test12() {
		System.out.println("Test 12");

	}

}
