package qsp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingList {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sharique/Desktop/Selenium%20Bhanu%20Sir/Webpages/hotel.html");
		 WebElement listBox = driver.findElement(By.id("slv"));
		 Select select= new Select(listBox);
		 
		 List<WebElement> options = select.getOptions();
		 ArrayList<String> list= new ArrayList<String>();
	     for(WebElement o:options) {
	    	 String s=o.getText();
	    	 list.add(s);
	    
	     }
	     Collections.sort(list);
		System.out.println(list);
	
	}
}
