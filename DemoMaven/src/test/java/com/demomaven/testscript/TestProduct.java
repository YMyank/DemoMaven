package com.demomaven.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.demomaven.generic.BaseClass;
import com.demomaven.pom.HomePage;
import com.demomaven.pom.ProductPage;

public class TestProduct extends BaseClass {
	
	
	
	@Test
	public void createProduct() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.setProd();
		ProductPage pp=new ProductPage(driver);
		pp.setCreateprod();
		pp.setProdname();
		pp.setSavebtn();
		
	}

}
