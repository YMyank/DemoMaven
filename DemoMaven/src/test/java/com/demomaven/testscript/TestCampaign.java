package com.demomaven.testscript;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.demomaven.generic.BaseClass;
import com.demomaven.generic.FileLib;

public class TestCampaign extends BaseClass {
	
	
	@Test
	public void createCampaign() throws EncryptedDocumentException, IOException {
		Reporter.log("Create Campaign");
	/*driver.findElement(By.linkText("More")).click();
	driver.findElement(By.linkText("Campaigns")).click();
	driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();*/
	Random r=new Random();
	int rannum = r.nextInt(1000);
	FileLib f=new FileLib();
	String data = f.getExcelData("CreateOrganisation", 1,1)+rannum;
	/*driver.findElement(By.name("campaignname")).sendKeys(data);
	driver.findElement(By.name("button")).click();*/
	
		
	}
	

}
