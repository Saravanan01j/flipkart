package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Warehouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthik\\selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.3plcentral.com/");
        driver.manage().window().maximize();
        String url =driver.getCurrentUrl();
        System.out.println("the current url:"+url);
        String title =driver.getTitle();
        System.out.println("title of webpage:"+title);
        driver.close();
        
        

	}

}
