package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPOM 
{
	
	@FindBy(how=How.XPATH,using="//a[text()=' Signup / Login']")
	private WebElement signuplogin;
	
	@FindBy(how=How.XPATH,using="//input[@name='name']")
	private WebElement name;
	
	@FindBy(how=How.XPATH,using="(//input[@name='email'])[2]")
	private WebElement email;
	
	@FindBy(how=How.XPATH,using="(//button[@type='submit'])[2]")
	private WebElement signupbtn;

	public WebElement getSignuplogin() {
		return signuplogin;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getSignupbtn() {
		return signupbtn;
	}

	
	
}
