package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceBilling {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/");
		driver.findElement(By.xpath("//label[contains(text(),'Keep me signed in')]")).click();
		/*WebElement email = driver.findElement(By.id("email"));
		String v = email.getAttribute("value");
		System.out.println(v);
		email.clear();
		email.sendKeys("Bhanu");*/
		
	}

}
