package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthik\\selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.bankofamerica.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement user = driver.findElement(By.xpath("//input[@placeholder='User ID']"));
        user.sendKeys("sam");
        WebElement pas = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        pas.sendKeys("12345678");
        WebElement sig = driver.findElement(By.xpath("//button[@id='signIn']"));
        sig.click();

	}

}
