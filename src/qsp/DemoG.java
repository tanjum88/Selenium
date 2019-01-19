package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoG {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.actitime.com/license-agreement");
		JavascriptExecutor j = (JavascriptExecutor)driver;
		for (int i=1;i<=10;i++){
			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		for (int i=1;i<=10;i++){
			j.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);}
	}

}
