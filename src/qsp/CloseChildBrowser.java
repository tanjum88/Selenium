package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		    driver.get("http://www.naukri.com");
		    String parent = driver.getWindowHandle();
		    Set<String> all = driver.getWindowHandles();
		    all.remove(parent);
		    for(String v:all) {
		    	driver.switchTo().window(v);
		    	driver.close();
		    }
	}

}
