package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002_addEmp extends General 
{
	@Test
	public void tc002() throws Exception

{
	DOMConfigurator.configure("log4j.xml");
	General obj = new  General();
	obj.openApplication();
	Thread.sleep(2122);
	obj.login();
	Thread.sleep(2122);
	obj.enterFrame();
	obj.addNewEmp();
	Thread.sleep(2122);
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();
	
}

}


