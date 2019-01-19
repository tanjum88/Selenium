package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sharique/Desktop/page1.html");
		//using index
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("a");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("a");
		//using id
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("b");
		//using address
		 WebElement e = driver.findElement(By.id("f1"));
		 driver.switchTo().frame(e);
		 driver.findElement(By.id("t2")).sendKeys("c");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("t1")).sendKeys("c");
		
	}

}
