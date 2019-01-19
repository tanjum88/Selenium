package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeActions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do;jsessionid=BA724E0AB7FE781643C66E56B22A03A8");
		String str= "actiTIME Inc.";
		WebElement link = driver.findElement(By.linkText(str));
		Actions actions= new Actions(driver);
		actions.sendKeys(Keys.CONTROL).click(link).perform();
	}

}
