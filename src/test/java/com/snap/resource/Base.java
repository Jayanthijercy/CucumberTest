package com.snap.resource;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public void launch() {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\veeva\\Cucumber\\driver\\chromedriver2.exe");
	driver=new ChromeDriver();	
	}

	public void url(String url) {

		driver.get(url);
	}
	
	
	public void clk(WebElement e) {
		
		e.click();

	}
	
	public void fill(WebElement e,String msg) {
		e.sendKeys(msg);

	}
	
	public void windows(String par,String x) {


	
if(!par.equals(x))
	{
	driver.switchTo().window(x);
	}}
	
	
}
