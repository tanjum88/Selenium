package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.get("file:///C:/Users/sharique/Desktop/hotel.html");
    WebElement listBox = driver.findElement(By.id("slv"));
    Select select= new Select(listBox);	
    System.out.println("it is multiple: " + select.isMultiple());
   List<WebElement> allOptions = select.getOptions();
   int total= allOptions.size();
   System.out.println("total" + total);
   for(int i=1;i<total;i++) {
	   String text= allOptions.get(i).getText();
	   System.out.println(text);
   }
   List<WebElement> allSelected = select.getAllSelectedOptions();
   int selectedcount= allSelected.size();
   System.out.println("Selected:" + selectedcount);
   for(int i=0;i<selectedcount;i++) {
	   String text= allSelected.get(i).getText();
	   System.out.println(text);
   }
	  WebElement selected = select.getFirstSelectedOption();
	  System.out.println(selected.getText());
	  
	  Thread.sleep(1000);
	  select.deselectAll();
	  Thread.sleep(1000);
	  
	  select.selectByIndex(0);
	  Thread.sleep(1000);
	  select.selectByValue("d");
	  Thread.sleep(1000);
	  select.selectByVisibleText("Vada");
	  Thread.sleep(1000);
	  
	  select.deselectByIndex(0);
	  Thread.sleep(1000);
	  select.deselectByValue("d");
	  Thread.sleep(1000);;
	  select.deselectByVisibleText("Vada");
	  
   }
	}


