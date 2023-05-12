package com.hrms.lib;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import com.hrms.utility.Log;

public class General extends Global {
	
	//To provide all re-reusable fun : for whole application
	
	public void openApplication() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions ob= new ChromeOptions();
		ob.addArguments("--remote-allow-origns=*");
		driver = new ChromeDriver(ob);
		driver.navigate().to(url);
		System.out.println("Application opened");
		Log.info("Appliction opened");
		
	}
	
		public void login() {
			driver.findElement(By.name(txt_loginname)).sendKeys(un);
			driver.findElement(By.name(txt_password)).sendKeys(pw);
			driver.findElement(By.name(btn_login)).click();
			System.out.println("Login completed");
			Log.info("L O G I N -- D O N E");
				
		}
		
		public void enterFrame(){
			driver.switchTo().frame(frm_frame);
			System.out.println("Entered into the frame");
		Log.info("FRAME ME AA GYE");
				
		}
		
		public void addNewEmp() throws InterruptedException {
			driver.findElement(By.xpath(btn_Add)).click();
			driver.findElement(By.name(EFN)).sendKeys("Samir");
			driver.findElement(By.name(ELN)).sendKeys("B");
			driver.findElement(By.xpath(btn_Save)).click();
			System.out.println("new emp added");
			Log.info("EMP ADDED -- D O N E");
		}
	
		public void deleteEmp() throws InterruptedException {
			driver.findElement(By.name("chkLocID[]")).click();
			driver.findElement(By.xpath(btn_delete)).click();
			System.out.println("Deleted");
			Log.info("D E L E T E  -- D O N E");
		}
		
		public void exitFrame(){
			driver.switchTo().defaultContent();
			System.out.println("Exit into the frame");
			Log.info("exit into frame");
		}
		
		public void logout() 
		{
			driver.findElement(By.linkText(link_logout)).click();
			System.out.println("LOGOUT COMPLETED");
		Log.info("L O G o U T -- D O N E");
		}
	
		public  void closeApplication () {
			driver.close();
			System.out.println("Application closed");
			Log.info("Appliction closed");
			
		}
	}
	


