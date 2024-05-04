package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisteruserloginPom {

	
	@FindBy(how=How.XPATH,using="//a[text()=' Signup / Login']")
	private WebElement signin;
	
	@FindBy(how=How.XPATH,using="//input[@name='name']")
	private WebElement name;
	
	
	@FindBy(how=How.XPATH,using="(//input[@name='email'])[2]")
	private WebElement email;
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Signup']")
	private WebElement signup;


	public WebElement getSignin() {
		return signin;
	}


	public WebElement getName() {
		return name;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getSignup() {
		return signup;
	}
	
	
}
