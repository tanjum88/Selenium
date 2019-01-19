package qsp;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}	

	public static void main(String[] args) {
		int n = LocalDate.now().getDayOfMonth();// java program for getting today's date
		String xp="//a[text()='"+n+"']";//Dynamic Xpath (making today's date as xpath)
		System.out.println(xp);//printng the date to check the date
   WebDriver driver= new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.manage().window().maximize();
   	driver.get("https://retail.starhealth.in/renewal");
   	driver.findElement(By.id("dtDOB")).click();
   	driver.findElement(By.xpath(xp)).click();//finding the element according to todays's date
   	
   	
	}

}
