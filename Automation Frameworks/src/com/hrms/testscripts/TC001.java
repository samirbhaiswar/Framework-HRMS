 package com.hrms.testscripts;
 
import org.apache.log4j.xml.DOMConfigurator;

import org.testng.annotations.Test;

import  com.hrms.lib.General;

public class TC001 extends General 
{
	@Test
public void tc001() throws Exception
{
		

	//first it will refer log xml file
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	
	obj.openApplication();

	obj.login();
	
	obj.logout();
	
	obj.closeApplication();
	
	
}
}
