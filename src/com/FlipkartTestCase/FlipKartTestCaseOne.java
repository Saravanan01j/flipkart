	package com.FlipkartTestCase;
	
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	
	public class FlipKartTestCaseOne {
		
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthik\\selenium\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.get("https://www.flipkart.com/");
	        Thread.sleep(1000);
	        driver.manage().window().maximize();
	        Thread.sleep(1000);
	        WebElement user = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	         user.click();
	        
	        WebElement user1 = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	       user1.sendKeys("ipad");
	        
	        Robot robo=new Robot();
	       //robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	        //robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	        robo.keyPress(KeyEvent.VK_ENTER);
	        robo.keyRelease(KeyEvent.VK_ENTER);
	        
	        Thread.sleep(2000);
	        
	        WebElement order = driver.findElement(By.xpath("//div[text()='APPLE iPad (9th Gen) 64 GB ROM 10.2 inch with Wi-Fi Only (Space Grey)']"));
	        order.click();
	        Thread.sleep(1000);
	        
	        Set<String> all = driver.getWindowHandles();
	        
	        for (String next : all) {
	        	
	        	String title = driver.switchTo().window(next).getTitle();
	        	System.out.println(title);
				
			}
	        
	        String currentUrl = driver.getCurrentUrl();
	        System.out.println(currentUrl);
	        
	        WebElement user2 = driver.findElement(By.xpath("//button[@type='button']"));
	        user2.click();
	        Thread.sleep(2000);
	        WebElement user3 = driver.findElement(By.xpath("//input[@type='text']"));
	        user3.sendKeys("donsaravanan005@gmail.com");
	        Thread.sleep(2000);
	        WebElement user4 = driver.findElement(By.xpath("//button[@type='submit']"));
	        user4.click();
		Thread.sleep(2000);
	        WebElement user5 = driver.findElement(By.xpath("//input[@maxlength='10']"));
	        user5.sendKeys("9600725886");
	        Thread.sleep(2000);
	        WebElement user6 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[4]/button/span"));
	        user6.click();
	        
	      
	        
	        
	        
	        
	        
	        
	        
	        
		}
	
	}
