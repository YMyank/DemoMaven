package com.demomaven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="user_name")
	WebElement untxb;
	
	@FindBy(name="user_password")
	WebElement pwtxb;
	
	@FindBy(id="submitButton")
	WebElement lgbtn;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void setLogin(String un, String pw) {
	  untxb.sendKeys(un);
	  pwtxb.sendKeys(pw);
	  lgbtn.click();
	}

}
