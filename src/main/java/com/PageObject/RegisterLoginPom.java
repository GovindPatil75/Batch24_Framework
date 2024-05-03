package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterLoginPom {
	
	@FindBy(how = How.XPATH,using="//a[text()=' Signup / Login']") 
	private WebElement SignUpButton;
	
	@FindBy(how = How.XPATH,using="//input[@name='name']")
	private WebElement Name;
	
	@FindBy(how = How.XPATH,using="(//input[@name='email'])[2]") 
	private WebElement EmailAddress;
	
	@FindBy(how = How.XPATH,using="(//button[@type='submit'])[2]") 
	private WebElement SignInButton;
	
	@FindBy(how = How.XPATH,using="(//input[@name='title'])[2]")
	private WebElement Title;
	
	@FindBy(how = How.XPATH,using="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(how = How.XPATH,using="//select[@name='days']")
	private WebElement birthDay;
	
	@FindBy(how = How.XPATH,using="//select[@name='months']")
	private WebElement birthMonth;
	
	@FindBy(how = How.XPATH,using="//select[@name='years']")
	private WebElement birthYear;
	
	@FindBy(how = How.XPATH,using="//label[text()='Sign up for our newsletter!']")
	private WebElement newSletter;

	public WebElement getSignUpButton() {
		return SignUpButton;
	}

	public WebElement getName() {
		return Name;
	}
	
	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	public WebElement getSignInButton() {
		return SignInButton;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getBirthDay() {
		return birthDay;
	}

	public WebElement getBirthMonth() {
		return birthMonth;
	}

	public WebElement getBirthYear() {
		return birthYear;
	}

	public WebElement getNewSletter() {
		return newSletter;
	}

}
