package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaleException
{

	private WebElement btn;
	public StaleException(WebDriver driver) {
	btn=driver.findElement(By.xpath("//div[.='Login ']"));
}
public void clickLogin() {
	btn.click();
}

}
