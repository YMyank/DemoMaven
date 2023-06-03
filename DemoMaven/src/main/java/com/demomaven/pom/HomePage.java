package com.demomaven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText="More")
	WebElement morebttn;
	
	@FindBy(linkText = "Campaigns")
	WebElement campaignbtn;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	WebElement logout;
	
	@FindBy(linkText = "Sign Out")
	WebElement signoutBtn;
	
	@FindBy(linkText = "Products")
	WebElement  product;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void setMorebttn() {
		morebttn.click();
	}

	public void setCampaignbtn() {
		campaignbtn.click();
	}

	public void setlogout() {
		logout.click();
		signoutBtn.click();
	}
	public void setProd() {
		product.click();
	}


	
	
	
	
	
	

}


