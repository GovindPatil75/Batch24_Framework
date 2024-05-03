package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
		String filepath=System.getProperty("user.dir")+"\\Config\\config.Properties";
		FileInputStream fis=new FileInputStream(filepath);
		pro=new Properties();
		pro.load(fis);
	}

	public String getBaseUrl() {
		
		return pro.getProperty("BaseUrl");
	}
	
	public String getBrowserName() {
		
		return pro.getProperty("BrowserName");
	}
	
    
}
