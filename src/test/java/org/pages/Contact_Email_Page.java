package org.pages;

import java.util.List;

import org.base.Global;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_Email_Page extends Global{
	
	public Contact_Email_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(@class,'search-bar-title') and contains(text(),'Contact')])[1]")
	private WebElement contacts_Email;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement contacts_Email_First_Name;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement contacts_Email_Last_Name;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement contacts_Email_Search;
	
	@FindBy(xpath="//button[contains(text(),'Reveal')]")
	private WebElement contacts_Email_Reveal_Button;
	
	@FindBy(xpath="//button[contains(text(),'Reveal')]")
	private List<WebElement> contacts_Email_Reveal_Button_List;
	
	@FindBy(xpath="//*[@fill='url(#pattern0)']")
	private WebElement contacts_Email_Cancel_Button;
	
	@FindBy(xpath="//*[contains(text(),' Select All ')]")
	private WebElement contacts_Email_Select_All;
	
	@FindBy(xpath="//button[contains(text(),'Reveal')]")
	private List<WebElement> contacts_Email_Select_All_List;
	
	@FindBy(xpath="(//span[contains(@class,'search-bar-title') and contains(text(),'Contact')])[2]")
	private WebElement contacts_Email_Button;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement contacts_Email_Input_Field;

	public WebElement getContacts_Email() {
		return contacts_Email;
	}

	public WebElement getContacts_Email_First_Name() {
		return contacts_Email_First_Name;
	}

	public WebElement getContacts_Email_Last_Name() {
		return contacts_Email_Last_Name;
	}

	public WebElement getContacts_Email_Search() {
		return contacts_Email_Search;
	}

	public WebElement getContacts_Email_Reveal_Button() {
		return contacts_Email_Reveal_Button;
	}

	public List<WebElement> getContacts_Email_Reveal_Button_List() {
		return contacts_Email_Reveal_Button_List;
	}

	public WebElement getContacts_Email_Cancel_Button() {
		return contacts_Email_Cancel_Button;
	}

	public WebElement getContacts_Email_Select_All() {
		return contacts_Email_Select_All;
	}

	public List<WebElement> getContacts_Email_Select_All_List() {
		return contacts_Email_Select_All_List;
	}

	public WebElement getContacts_Email_Button() {
		return contacts_Email_Button;
	}

	public WebElement getContacts_Email_Input_Field() {
		return contacts_Email_Input_Field;
	}
	
	

}
