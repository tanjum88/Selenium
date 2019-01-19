package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sharique/Desktop/Samplepage.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[title='t1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='http://www.google.com']")).click();
		

		
	}

}
