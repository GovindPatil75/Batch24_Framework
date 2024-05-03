package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class registerPom {
	
	public WebElement getText() {
		return text;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSign() {
		return sign;
	}


	@FindBy(how=How.XPATH,using="//a[@href='/login']")
	private WebElement sign;
	
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement text;
	
	@FindBy(how=How.XPATH,using="(//input[@type='email'])[2]")
	private WebElement email;
	
	
	
	

}
