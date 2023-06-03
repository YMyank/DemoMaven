package com.demomaven.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.demomaven.pom.HomePage;
import com.demomaven.pom.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/Driver/geckodriver.exe");
	       }
	 
	@BeforeTest
	public void openbrowser() throws IOException {
		FileLib fl=new FileLib();
		String BROW = fl.getPropertyData("BROWSER");
		if(BROW.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(BROW.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		                                          }
	@BeforeMethod
		public void login() throws IOException, InterruptedException {
		FileLib fl=new FileLib();
		String url = fl.getPropertyData("URL");
		driver.get(url);
		
		LoginPage lp=new LoginPage(driver);
		lp.setLogin("admin", "admin");
		
        }
	@AfterMethod
	public void logout() {
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//driver.findElement(By.linkText("Sign Out")).click();
		HomePage hp=new HomePage(driver);
		hp.setlogout();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	

}
