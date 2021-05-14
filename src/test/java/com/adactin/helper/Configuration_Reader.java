package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	
	public Configuration_Reader() throws Exception {
		File f = new File("E:\\java\\Final_Project_Maven\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);

	
	}

	public String getBroswer() {
		String broswer = p.getProperty("broswer");

		return broswer;
	}
	public String getUrl() {

		String url = p.getProperty("url");
		return url;
	}
	
	public String getCvv() {
		
		String cvv = p.getProperty("cvv");
		return cvv;
		
	}
	
	public String getCardNumber() {
		String cardNumber = p.getProperty("cardNumber");
		return cardNumber;

	}
}

