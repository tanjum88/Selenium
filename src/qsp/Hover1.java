package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qspiders.com/");
		String xp= "//a[contains(text(),'About us')]";
		WebElement menu = driver.findElement(By.xpath(xp));
		Actions actions= new Actions(driver);
		actions.moveToElement(menu).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Faculty")).click();
        driver.close();
        
	}

}
