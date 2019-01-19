package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoE {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new  ChromeDriver();
    driver.get("http://www.naukri.com");
   Set<String> allWHS = driver.getWindowHandles();
   int count= allWHS.size();
   System.out.println(count);
   for (String v:allWHS){
	   driver.switchTo().window(v);
   System.out.println(driver.getTitle());
   Thread.sleep(1000);
   
   driver.close();
   }
	}

}
