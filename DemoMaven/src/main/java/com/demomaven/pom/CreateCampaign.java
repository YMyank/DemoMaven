package com.demomaven.pom;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demomaven.generic.FileLib;

public class CreateCampaign {
	
	@FindBy(name="campaignname")
	WebElement campNametxb;
	
	@FindBy(name="button")
	WebElement saveBtn;

	public CreateCampaign(WebDriver driver) {
       PageFactory.initElements(driver, this);
	}

	public void setCampNametxb() throws EncryptedDocumentException, IOException {
		Random ran=new Random();
		int ranNum = ran.nextInt(1000);
		FileLib fl= new FileLib();
		String data = fl.getExcelData("CreateCampaign", 1, 1)+ranNum;
		campNametxb.sendKeys(data);
	}

	public void setSaveBtn() {
		saveBtn.click();
	}
	
	

}
