package com.demomaven.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.demomaven.generic.BaseClass;
import com.demomaven.pom.Campaigns;
import com.demomaven.pom.CreateCampaign;
import com.demomaven.pom.HomePage;

public class CampaignPom extends BaseClass {
	@Test
	public void createCampaign() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.setMorebttn();
		hp.setCampaignbtn();
		Campaigns c=new Campaigns(driver);
		c.setCreateCampaignBtn();
		CreateCampaign cc=new CreateCampaign(driver);
		cc.setCampNametxb();
		cc.setSaveBtn();
		
		
		
		
		
		
		
	}
	

}
