package com.browserlanch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLanche {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthik\\selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
	}

}
