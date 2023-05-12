package Exp_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforemehodaftermethod {
	@BeforeMethod
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
	@AfterMethod
	public void third () {
	System.out.println("Logout done");
	}
}


