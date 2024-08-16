package org.name;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demofour {
	@Parameters({"username","password"})
	@Test
	private void tc1(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}

}
