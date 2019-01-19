package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicitwait
		driver.get("https://demo.actitime.com/login.do;jsessionid=BA724E0AB7FE781643C66E56B22A03A8");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);//ExplicitWait
		wait.until(ExpectedConditions.titleContains("Time"));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("logoutLink")).click();
		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
