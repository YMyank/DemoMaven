package com.demomaven.pom;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demomaven.generic.FileLib;

public class ProductPage {
	@FindBy(xpath="//img[@title='Create Product...']")
	WebElement createprod;
	
	@FindBy(name="productname")
	WebElement prodname;
	
	@FindBy(name="button")
	WebElement savebtn;

	
	public void setProdname() throws EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		Random ran= new Random();
		int num = ran.nextInt(1000);
		String data = f.getExcelData("products", 1, 0)+num;
		prodname.sendKeys(data);
	}

	public ProductPage(WebDriver driver) 
	{
     PageFactory.initElements(driver, this);

	}

	public void setCreateprod() {
		createprod.click();
	}



	public void setSavebtn() {
		savebtn.click();
	}
	





}
