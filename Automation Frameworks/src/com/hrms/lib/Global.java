package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
public WebDriver driver;

// to provide testData & Objects/elements for whole application

//*************Test data 
	//  DT     Variable        VV
public String url = "http://183.82.103.245/nareshit/login.php";
public String un = "nareshit";
public String pw = "nareshit";
public String fn = "Viswajit";
public String ln = "Swain";


//*******Objects/Elements
public String txt_loginname = "txtUserName";
public String txt_password = "txtPassword";
public String btn_login = "Submit";
public String link_logout ="Logout";
public String frm_frame = "rightMenu";
public String btn_Add = "//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
public String EFN = "txtEmpFirstName";
public String ELN = "txtEmpLastName";
public String btn_Save = "//*[@id=\"btnEdit\"]";
//public String 
public String btn_delete = "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";


}






//Tc002_add
//openAppl
//login
//click on add button
//Enter emp firstn an lastname
//click on save btn
//logout
//close

//TC003_edit
//openApp
//login
//click on ny emp name

//click on edit button
//clear existing empl FstName and LName

//type="checkbox" class="checkbox" name="chkLocID[]" value="7547"

