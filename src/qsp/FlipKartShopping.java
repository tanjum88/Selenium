package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class FlipKartShopping {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Thread.sleep(3000);
		WebElement men=driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(men).perform();
		
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[@title='Kurta, Pyjama & more']"));
		element.click();
		
		WebElement priceBox = driver.findElement(By.xpath("(//select[@class='fPjUPw'])[2]"));
		Select select1=new Select(priceBox);
		select1.selectByIndex(0);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='Prakasam Cotton'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Free']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Black']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='_3togXc']")).click();
		
		Thread.sleep(3000);
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./Photo/dress.png");
		FileUtils.copyFile(srcFile, destFile);
		
	}

}
