package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//declaration
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	//Initialization
	
	public LoginPage(WebDriver driver) {
		unTB= driver.findElement(By.id("username"));
		pwTB= driver.findElement(By.name("pwd"));
		loginBTN= driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	 // Utilization 
	
	public void setUserName(String un) {
		unTB.sendKeys(un);
	}
	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin() {
		loginBTN.click();
	
	}

	

}
