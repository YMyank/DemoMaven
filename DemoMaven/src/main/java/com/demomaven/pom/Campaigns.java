package com.demomaven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaigns {
	@FindBy(xpath="//img[@title='Create Campaign...']")
	WebElement createCampaignBtn;

	public Campaigns(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setCreateCampaignBtn() {
		createCampaignBtn.click();
	}
	
	

}
