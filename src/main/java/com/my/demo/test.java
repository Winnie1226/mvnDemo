package com.my.demo;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		WebDriver driver;
		String url_1 = "https://www.baidu.com";
		driver = new ChromeDriver();
		
//		System.setProperty("webdriver.ie.driver", ".\\Tools\\IEDriverServer.exe"); 
//		driver = new InternetExplorerDriver();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    driver.get(url_1);
		   
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		assertEquals(1, 1);
	    driver.quit();
		Calc calc = new Calc();
		System.out.println(calc.add(1, 1));
	}

}
