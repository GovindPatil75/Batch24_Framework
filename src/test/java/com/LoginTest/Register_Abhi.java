package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.registerPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Register_Abhi extends BaseClass {
	
	@Test
	public void Register() throws Exception {
		
		registerPom sign=PageFactory.initElements(driver, registerPom.class);
		
		String usedata=excel.getStringTestData("LoginTest", 1, 0);
		String emaildata=excel.getStringTestData("LoginTest", 1, 1);
		
		Library.custom_Click(sign.getSign(), "click");
		
		Thread.sleep(2000);
		
		Library.custom_Sendkeys(sign.getText(),usedata, "username");
		Library.custom_Sendkeys(sign.getEmail(),emaildata, "Email");
	}
	
	

}
