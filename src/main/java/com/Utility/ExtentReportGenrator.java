package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		String ReportPath="C:\\Users\\Dell\\eclipse-workspace\\Batch24_Framework\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch 24 Report");
		reporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Batc24_Framework");
		extent.setSystemInfo("O.S.", "Window 10");
		extent.setSystemInfo("Automation tool", "Selenium WebDriver");
		extent.setSystemInfo("QA", "ABC");
		return extent;
		
	}

}
