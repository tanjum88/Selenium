package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoH {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.get("file:///C:/Users/sharique/Desktop/Samplepage.html");
    driver.findElement(By.tagName("a")).click();
    Thread.sleep(1000);
    driver.navigate().back();
    Thread.sleep(1000);
    driver.findElement(By.id("d1")).click();
    Thread.sleep(1000);
    driver.navigate().back();
    driver.findElement(By.name("n1")).click();
    Thread.sleep(1000);
    driver.navigate().back();
    driver.findElement(By.className("c1")).click();
    Thread.sleep(1000);
    driver.navigate().back();
    driver.findElement(By.linkText("MyText")).click();;
    Thread.sleep(1000);
    driver.navigate().back();
    driver.findElement(By.partialLinkText("My")).click();;
    driver.close();
    
    
    
    
	}

}
