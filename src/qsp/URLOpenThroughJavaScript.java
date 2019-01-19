package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLOpenThroughJavaScript {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.location='https://www.fb.com'");
	
	}
	
}
