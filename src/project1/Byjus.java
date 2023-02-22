package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Byjus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthik\\selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://byjus.com/");
        driver.manage().window().maximize();
        
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("saravanan");
        WebElement pas = driver.findElement(By.xpath("//input[@name='mobile']"));
        pas.sendKeys("9600725886");
        WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
        mail.sendKeys("donsaravanan005@gmail.com");
       // WebElement sel = driver.findElement(By.xpath("//select[@name='state']"));
        Select s =new Select (driver.findElement(By.xpath("//select[@name='state']")));
        s.selectByVisibleText("Goa");

	}

}
