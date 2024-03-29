package com.jbkclass.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.jbkclass.qa.utility.SeleniumListener;
import com.jbkclass.qa.utility.TestUtil;

public class TestBase
{
	public static WebDriver driver;
	public static Properties prop;
	
	public static EventFiringWebDriver eventDriver ;
public static SeleniumListener selListener;
	
	public TestBase()
	{
		prop=new Properties();
  		try
		{ 
		FileInputStream file = new FileInputStream("E:\\JBKWEBSiteTesting\\OnlineProject\\"
				+ "src\\main\\java\\com\\jbkclass\\qa\\config\\config.properties");
		
		prop.load(file);
		}
		catch(FileNotFoundException e){
	}
		catch( IOException e1){
			
		}
	
	}
	
	public static void initialization(){
		String browerName=prop.getProperty("browser");	
	
		if(browerName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println(prop.getProperty("url"));
			driver.get(prop.getProperty("url"));

		}
		else if(browerName.equals("FF"))
		{
			//System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			driver=new FirefoxDriver(); 
		}
		
		eventDriver=new EventFiringWebDriver(driver);
		 selListener=new SeleniumListener();
		eventDriver.register(selListener);
		driver=eventDriver;
		
		
	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT ,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		
	}
}

