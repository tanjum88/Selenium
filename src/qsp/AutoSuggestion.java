package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		
		String xp= "//div[contains(text(),'java')]";
		List<WebElement> allASE = driver.findElements(By.xpath(xp));

		int count=allASE.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			WebElement ASE= allASE.get(i);
			String text= ASE.getText();
			System.out.println(text);	
		}
		allASE.get(0).click();
		driver.close();
	}

}
