package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.PageObject.RegisterPOM;
import com.Utility.BaseClass;
import com.Utility.Library;



public class RegisterAE extends BaseClass
{
		@Test
		public void Verifyregister()
		{	
			RegisterPOM register=PageFactory.initElements(driver, RegisterPOM.class);
			
			Library.custom_Click(register.getSignuplogin(), "Sign in button");
			String name=excel.getStringTestData("Sheet1", 0, 0);
			String email=excel.getStringTestData("Sheet1", 0, 1);
			
			Library.custom_Sendkeys(register.getName(), name, "name");
			Library.custom_Sendkeys(register.getEmail(), email, "email");
			Library.custom_Click(register.getSignupbtn(), "Signup button");
		}
}
