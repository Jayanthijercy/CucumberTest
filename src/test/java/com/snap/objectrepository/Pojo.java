package com.snap.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snap.resource.Base;

public class Pojo extends Base{
	
	public Pojo() {

	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='inputValEnter']")
	private WebElement srcbox;
	
	@FindBy(xpath="//span[@class='searchTextSpan']")
	private WebElement srcclick;
	
	@FindBy(xpath="//p[@title='Philips HP8100/46 Hair Dryer']")
	private WebElement product;
	
	public WebElement getSrcbox() {
		return srcbox;
	}

	public WebElement getSrcclick() {
		return srcclick;
	}

	public WebElement getProduct() {
		return product;
	}

	

}
