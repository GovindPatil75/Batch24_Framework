package com.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {

	public static ExtentTest test;
	
	public static void custom_Sendkeys(WebElement element,String value,String fieldname) {
		try {
		element.sendKeys(value);
		test.log(Status.PASS, fieldname+"==Value succefully send =="+value);
		
		}catch(Exception e) {
			
		test.log(Status.FAIL, e.getMessage());
			
		}
	}
	
	public static void custom_Click(WebElement element,String fieldname) {
		try {
		element.click();
		test.log(Status.PASS, fieldname+"==Clicked succefully..");
		}catch(Exception e) {
			
			test.log(Status.FAIL, e.getMessage());
		}
	}
	
	
	public static void getExplicitWait(WebDriver driver,long Time,WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Time));
		wait.until(ExpectedConditions.visibilityOf(element));
	
	
	}
	
	
	
	
	
	
	
}
