package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoC {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//String s= driver.getPageSource();
		//System.out.println(s);
		driver.close();

			}

}
