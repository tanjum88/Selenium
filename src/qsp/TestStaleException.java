package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestStaleException {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://demo.actitime.com/login.do;jsessionid=31423565F94C9047B6D26AD5B596AF25");
    StaleException exception = new StaleException(driver);
    Thread.sleep(2000);
    driver.navigate().refresh();
    Thread.sleep(2000);
    exception.clickLogin();
	}

}
