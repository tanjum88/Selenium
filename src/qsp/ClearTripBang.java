package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClearTripBang {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(8000);
		driver.findElement(By.id("FromTag")).sendKeys("Bang");
		Thread.sleep(8000);
		List<WebElement> allSug = driver.findElements(By.xpath("//li/a[contains(text(),'Bang')]"));
		int count = allSug.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			WebElement ASE= allSug.get(i);
			String text= ASE.getText();
			System.out.println(text);
		}
		driver.close();
		

	}

}
