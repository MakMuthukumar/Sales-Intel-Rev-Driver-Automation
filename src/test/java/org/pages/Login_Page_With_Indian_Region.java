package org.pages;

import java.util.List;

import org.base.Global;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_With_Indian_Region extends Global{

	
	public Login_Page_With_Indian_Region() {
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement userName;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Log In')]")
	private WebElement loginCTA;


	@FindBy(id = "rev_driver")
	private WebElement switchTOFrame;
	
	@FindBy(xpath="//button[contains(text(),'Filters')]")
	private WebElement filter;
	
	@FindBy(xpath="//button[contains(text(),'Filters')]")
	private List<WebElement> filter_List;
	
	@FindBy(id="ooc-destination-country")
	private List<WebElement> regionButton;
	
	@FindBy(xpath="//*[@destination-country-code='us']")
	private WebElement regionButton1;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginCTA() {
		return loginCTA;
	}

	public WebElement getSwitchTOFrame() {
		return switchTOFrame;
	}
	
	public WebElement getFilter() {
		return filter;
	}

	public List<WebElement> getFilter_List() {
		return filter_List;
	}

	public List<WebElement> getRegionButton() {
		return regionButton;
	}

	public WebElement getRegionButton1() {
		return regionButton1;
	}
	
	


}
