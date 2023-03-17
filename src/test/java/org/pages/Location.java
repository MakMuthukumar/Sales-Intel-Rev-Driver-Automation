package org.pages;

import org.base.Global;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location extends Global{
	public Location() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'search-bar-title') and contains(text(),'Location')]")
	private WebElement locationHome;

	public WebElement getLocationHome() {
		return locationHome;
	}
	
	

}
