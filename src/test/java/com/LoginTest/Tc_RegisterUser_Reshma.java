package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.RegisterLoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Tc_RegisterUser_Reshma extends BaseClass{
	
	@Test
	public void verifyTestCaseRegisterUser() {
		
		//3.Verify that home page is visible successfully
		//String ExpectedHomePgeUrl=driver.getCurrentUrl();
		//System.out.println(ExpectedHomePgeUrl);
		//String ActualHomePageUrl="https://automationexercise.com/";
		//Assert.assertEquals(ActualHomePageUrl, ExpectedHomePgeUrl);
		
		RegisterLoginPom registerUser = PageFactory.initElements(driver, RegisterLoginPom.class);
		Library.custom_Click(registerUser.getSignUpButton(),"SignUpButton");
		
		String name=excel.getStringTestData("RegisterUser", 0, 0);
		String EmailAddress=excel.getStringTestData("RegisterUser", 1, 0);
		
		Library.custom_Sendkeys(registerUser.getName(), name, "Name");
		Library.custom_Sendkeys(registerUser.getEmailAddress(), EmailAddress, "EmailAddress");
		
		Library.custom_Click(registerUser.getSignInButton(),"SignInButton");
		Library.custom_Click(registerUser.getTitle(),"Title");
	
	} 

}
