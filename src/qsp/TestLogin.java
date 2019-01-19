package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		LoginPage loginPage= new LoginPage(driver);
		loginPage.setUserName("admin");
		loginPage.setPassword("manager");
		loginPage.clickLogin();
		Thread.sleep(8000);
		String s=driver.getTitle();
		System.out.println("Homepage Titles: "+s);

	}

}
