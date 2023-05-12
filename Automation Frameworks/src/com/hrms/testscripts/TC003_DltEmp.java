package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC003_DltEmp extends General{
	@Test
public void tc003() throws Exception{
	General obj = new General();
	DOMConfigurator.configure("log4j.xml");
	obj.openApplication();
	Thread.sleep(2122);
	obj.login();
	Thread.sleep(2122);
	obj.enterFrame();
	Thread.sleep(2122);
	obj.deleteEmp();
	Thread.sleep(2122);
	
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();
}
}
