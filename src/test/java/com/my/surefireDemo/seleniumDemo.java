package com.my.surefireDemo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo {
	private static WebDriver driver;
	String url_1 = "https://www.baidu.com";
	String url_2 = "https://www.jd.com";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		
//		System.setProperty("webdriver.ie.driver", ".\\Tools\\IEDriverServer.exe"); 
//		driver = new InternetExplorerDriver();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test1() {
		
	    driver.get(url_1);
	   
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		assertEquals(1, 1);
		
	}
	@Test
	public void test2() {
		
	    
	    driver.get(url_2);
	   
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		assertEquals(1, 1);
		
	}

}
