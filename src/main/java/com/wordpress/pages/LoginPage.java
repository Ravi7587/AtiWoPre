package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wordpress.base.Driver;
import com.wordpress.utils.Log;



/*
 * Class : LoginPage class 
 * Description: Contains Page Objects and methods for WordPress Login page by PageFactory Implementation
 * Date Created: 2-May-2020 
 * Author: Ravichandra Kammara
 */


public class LoginPage extends Driver{
	

	
	private By lnk_logIn = By.xpath("//div[@class='site-content-contain']//a[contains(text(),'Log in')]");
	private By edt_userName = By.xpath("//input[@id='user_login']");
	private By edt_userPwd = By.xpath("//input[@id='user_pass']");
	private By btn_logIn = By.xpath("//input[@id='wp-submit']");
	
	

	// Constructor to initialize Login Page Objects
	public LoginPage() {
		Log.info("Page Factory Initialization for Login Page");
		PageFactory.initElements(driver, this);
	}


}
