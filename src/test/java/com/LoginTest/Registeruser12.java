package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.RegisteruserloginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Registeruser12 extends BaseClass{

	@Test
	 public void verifyRegister() {
		
		RegisteruserloginPom register=PageFactory.initElements(driver,RegisteruserloginPom.class);	
		
		
		Library.custom_Click(register.getSignin(), "sign in button");
		String name=excel.getStringTestData("Sheet1",0,0);
		String email=excel.getStringTestData("Sheet1",0,1);
		
		
		Library.custom_Sendkeys(register.getName(),name,"name");
		Library.custom_Sendkeys(register.getEmail(),email,"email");
		Library.custom_Click(register.getSignup(),"signupbutton");
		
		
	}
	
	
}
