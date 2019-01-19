package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/");
		// WebElement email = driver.findElement(By.id("email"));
		 //email.click();
		WebElement email = driver.findElement(By.id("email"));
		boolean s = email.isDisplayed();
		System.out.println(s);
		WebElement pass = driver.findElement(By.id("password"));
		boolean p = pass.isDisplayed();
		System.out.println(p);
		WebElement ch = driver.findElement(By.xpath("//label[@for='filled-in-box']"));
		boolean c = ch.isEnabled();
		System.out.println(c);
		//String value = email.getAttribute("name");
		//System.out.println(value);
		//int x = email.getLocation().getX();
		//int y= email.getLocation().getY();
		//System.out.println("location is" + x  + " " + y);
		//email.clear();
		//email.sendKeys("tabishwinnerinchess");
		//int h = email.getSize().getHeight();
		//int w= email.getSize().getHeight();
		//System.out.println("height is " + h + " and width is " + w + ".");
	}

}
