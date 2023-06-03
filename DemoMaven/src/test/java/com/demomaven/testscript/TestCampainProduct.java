package com.demomaven.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.demomaven.generic.BaseClass;
import com.demomaven.pom.Campaigns;
import com.demomaven.pom.CreateCampaign;
import com.demomaven.pom.HomePage;
import com.demomaven.pom.ProductPage;

public class TestCampainProduct extends BaseClass{
	@Test
	public void CreateCampProd() throws EncryptedDocumentException, IOException {
		
		HomePage hp=new HomePage(driver);
		hp.setProd();
		ProductPage pp=new ProductPage(driver);
		pp.setCreateprod();
		pp.setProdname();
		pp.setSavebtn();
		
		hp.setMorebttn();
		hp.setCampaignbtn();
		Campaigns c=new Campaigns(driver);
		c.setCreateCampaignBtn();
		CreateCampaign cc=new CreateCampaign(driver);
		cc.setCampNametxb();
		
	}

}
