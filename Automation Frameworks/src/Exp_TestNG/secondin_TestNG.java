package Exp_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class secondin_TestNG {
	@BeforeClass
	public void first () {
		System.out.println("Login done");
	}
	@AfterClass
	public void fourh () {
	System.out.println("Logout done");
	}
	@Test
	public void second () {
	System.out.println("Login done");
	}
	@Test
	public void third () {
	System.out.println("Logout done");
	}
}
