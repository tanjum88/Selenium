package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoF {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		TakesScreenshot t= (TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File destFile= new File("./Photo/faceboo.png");
	FileUtils.copyFile(srcFile, destFile);
	driver.close();

	}

}
