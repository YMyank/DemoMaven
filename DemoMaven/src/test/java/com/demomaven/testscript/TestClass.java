package com.demomaven.testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.demomaven.generic.BaseClass;
import com.demomaven.generic.FileLib;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass extends BaseClass{
	@Test
	public void demotest() throws IOException {

		Reporter.log("this is for demo");
	
	}

}
