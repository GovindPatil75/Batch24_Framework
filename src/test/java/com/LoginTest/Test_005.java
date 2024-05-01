package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_005 extends BaseClass {
	@Test
	public void verifyTC_005() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		String Username=excel.getStringTestData("LoginTest", 0, 0);
		String Password=excel.getStringTestData("LoginTest", 0, 1);
		
		
		Library.custom_Sendkeys(login.getEmail(), Username ,"Email");
		Library.custom_Sendkeys(login.getPassword(), Password ,"Password");
		Library.custom_Click(login.getBtnLogin() ,"Login Button");
		
}
