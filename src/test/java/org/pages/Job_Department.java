package org.pages;

import org.base.Global;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Job_Department extends Global{
	public Job_Department() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'search-bar-title') and contains(text(),'Job Department')]")
	private WebElement job_Department_Button;
	
	@FindBy(xpath="(//label[contains(text(),'Select All ')])[2]")
	private WebElement job_Department_Select_All;
	
	@FindBy(xpath="(//*[contains(text(),'Job Department')]//following::input[@type='checkbox'])[1]")
	private WebElement job_Department_Select_All_Check_Box;
	
	@FindBy(xpath="(//label[contains(text(),'Unselect ')])[1]")
	private WebElement unSelect;

	public WebElement getJob_Department_Button() {
		return job_Department_Button;
	}

	public WebElement getJob_Department_Select_All() {
		return job_Department_Select_All;
	}

	public WebElement getJob_Department_Select_All_Check_Box() {
		return job_Department_Select_All_Check_Box;
	}

	public WebElement getUnSelect() {
		return unSelect;
	}
	
	
}
