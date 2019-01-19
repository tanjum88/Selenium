package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTripHyd {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(8000);
		driver.findElement(By.id("FromTag")).sendKeys("Hyd");
		Thread.sleep(8000);
		List<WebElement> allMatches = driver.findElements(By.xpath("//a[contains(text(),'Hyderabad')]"));
		int size = allMatches.size();
		System.out.println(size);
	}  

}
