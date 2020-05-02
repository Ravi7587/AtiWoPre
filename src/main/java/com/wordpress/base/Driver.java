package com.wordpress.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.wordpress.utils.Log;
import org.apache.log4j.Logger;

/*
 * Class : Driver 
 * Description: Contains Selenium Driver Initialization and Properties file reading.
 * Date Created: 2-May-2020
 * Author: Ravichandra Kammara
 */

public class Driver {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	public static long startTime, endTime;

	
	  //  Function Name : Driver Constructor
	  //  Description : Initialization of Driver, Reading Property file.
	  //  Date Created : 2-May-2020 
	  //  Number Of Parameters : NA 
	  //  Parameter Value : NA 
	  //  Return Value : NA 
	  //  Date Modified : NA 
	  //  Author : Ravichandra Kammara

		public Driver() {
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(
						System.getProperty("user.dir") + "/src/main/java/com/ncd" + "/base/generic.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		  //  Function Name : initialization 
		  //  Description : Firefox driver initilization
		  //  Date Created : 2-May-2020
		  //  Number Of Parameters : NA 
		  //  Parameter Value : NA 
		  //  Return Value : NA 
		  //  Date Modified : NA 
		  //  Author : Ravichandra Kammara

		public static void initialization() throws MalformedURLException {
			DOMConfigurator.configure("log4j.xml");
			Log.info("Driver Initialization & login to Wordpress application");
			startTime = System.currentTimeMillis();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			endTime = System.currentTimeMillis();
		}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		

	}

}
