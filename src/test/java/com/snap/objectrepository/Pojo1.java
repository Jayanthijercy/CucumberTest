package com.snap.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snap.resource.Base;

public class Pojo1 extends Base {
	
public Pojo1() {

	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//div[@id='add-cart-button-id']")
private WebElement add;

public WebElement getAdd() {
	return add;
}

}
