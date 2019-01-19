package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivago {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.trivago.in/");
		driver.findElement(By.id("horus-querytext")).sendKeys("Bang");
		String xp = "//mark[contains(text(),'Bang')]";
		List<WebElement> allSug = driver.findElements(By.xpath(xp));
		int count = allSug.size();
		System.out.println(count);
	}

}
