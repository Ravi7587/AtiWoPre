package com.wordpress.base;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import jxl.read.biff.BiffException;


/*
 * Class : GenericLibrary 
 * Description : Contains Generic methods for the Framework
 * Date Created : 2-May-2020
 * Author : Ravichandra Kammara
 */

public class GenericLibrary extends Driver{
	
	
	public static HSSFWorkbook workbook;
	public static HSSFSheet worksheet;
	public static DataFormatter formatter = new DataFormatter();
	public static String file_location = System.getProperty("user.dir") + "/src/main/java/com/ncd"
			+ "/testdata/TestData.xls";

	public static int SIZE, COUNT = 0;
	public static String REPORTIN = "", TESTCASENAME, APPLICATIONNAME, PLATFORMNAME, PLATFORMVERSION, APPPACKAGE,
			APPACTIVITY, VERSION, ENVIRONMENT, SETUPTEXT, INSTALLEMCMOBILE;
	public static int PASSCOUNT = 0, FAILCOUNT = 0;
	public static long TOTALTIME = 0;

	public static int step = 1, j = 0;

	public static float FLOATTOTALTIME = 0;
	
	public static WebDriver driver;
	
	
	// Function Name : verifyObjectExists(WebDriver driver, By element)
	// Description : verify the object is exist or not by waiting until the object exist or maximum time exceed
	// Date Created : 28-Jun-2016
	// Number Of Parameters : 2
	// Parameter Value : Driver object, Object Locator
	// Return Value : true or false
	// Date Modified : NA
	// Author : Ravichandra Kammara

	public static boolean verifyObjectExists(WebDriver driver, By element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.presenceOfElementLocated(element));
			return driver.findElement(element).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	// Function Name : objectDisplayed(WebDriver driver, By element)
	// Description : verify the object is exist or not
	// Date Created : 2-May-2020
	// Number Of Parameters : 2
	// Parameter Value : Driver object, Object Locator
	// Return Value : true or false
	// Date Modified : NA
	// Author : Ravichandra Kammara

	public static boolean objectDisplayed(WebDriver driver, By element) {
		try {
			return driver.findElement(element).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	// Function Name: objectEnabled(WebDriver driver, By element)
	// Description: verify the object is exist or not
	// Date Created: 2-May-2020
	// Number Of Parameters: 2
	// Parameter Value: Driver object, Object Locator
	// Return Value: true or false
	// Date Modified: NA
	// Author: Ravichandra Kammara

	public static boolean objectEnabled(WebDriver driver, By element) {
		try {
			if (driver.findElement(element).isEnabled()) {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	// Function Name: verifyBrowserObjectExist(WebDriver driver, By element, int waitingTime)
	// Description: verify Object Exists
	// Date Created: 2-May-2020
	// Number Of Parameters: 3
	// Parameter Value: Driver object, Object Locator, int waitTime
	// Return Value: true or false
	// Date Modified: NA
	// Author: Ravichandra Kammara

	public static boolean verifyBrowserObjectExist(WebDriver driver, By element, int waitingTime) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitingTime);
			wait.until(ExpectedConditions.presenceOfElementLocated(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	// Function Name : objectClick(WebDriver driver, By element, String btnName)
	// Description : click on desired object
	// Date Created : 2-May-2020
	// Number Of Parameters : 3
	// Parameter Value : Driver object, Object Locator, Attribute Name
	// Return Value : true or false
	// Date Modified : NA
	// Author : Ravichandra Kammara

	public static void objectClick(WebDriver driver, By element, String btnName)
			throws NoSuchElementException, IOException, BiffException {
		try {
			startTime = System.currentTimeMillis();
			verifyBrowserObjectExist(driver, element, 50);
			driver.findElement(element).click();
			endTime = System.currentTimeMillis();
			/*			writeReport(true, step++, "Click on " + btnName + " button",
					"User should be able to click on " + btnName + " button",
					"User is able to click on " + btnName + " button", endTime - startTime);
			 */					
		} catch (Exception e) {
			e.printStackTrace();
			/*      writeReport(false, step++, "Click on " + btnName + " button",
					"User should be able to click on " + btnName + " button",
					"User is not able to click on " + btnName + " button", endTime - startTime);
			 */					
		}
	}

	

}
