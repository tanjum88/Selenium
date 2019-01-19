package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}	
	public static void main(String[] args) throws InterruptedException {
  WebDriver driver = new ChromeDriver();
  driver.get("file:///C:/Users/sharique/Desktop/Selenium%20Bhanu%20Sir/Webpages/alert.html");
  driver.findElement(By.id("clear")).click();
  Alert alert= driver.switchTo().alert();
  System.out.println(alert.getText());
  Thread.sleep(1000);
  alert.accept();
  
  driver.findElement(By.id("delete")).click();
  Alert alert2= driver.switchTo().alert();
  System.out.println(alert2.getText());
  Thread.sleep(1000);
  alert.dismiss();
	}

}
