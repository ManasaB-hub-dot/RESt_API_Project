package com.seleniumCode;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {
	
		
	    public static void main(String[] args) throws Exception {
	        Properties prop = new Properties();
	        FileInputStream fis = new FileInputStream("config.properties");

	        prop.load(fis);

	        System.out.println(prop.getProperty("browser"));
	        System.out.println(prop.getProperty("url"));
	    }
	}

