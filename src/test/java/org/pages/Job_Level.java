package org.pages;

import org.base.Global;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Job_Level extends Global {
	public Job_Level() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'search-bar-title') and contains(text(),'Job Level')]")
	private WebElement job_Level_Button;
	
	@FindBy(xpath="(//label[contains(text(),'Select All ')])[1]")
	private WebElement job_Level_Select_All;
	
	@FindBy(xpath="(//*[contains(text(),'Job Level')]//following::input[@type='checkbox'])[1]")
	private WebElement job_Level_Select_All_Check_Box;
	
	@FindBy(xpath="(//label[contains(text(),'Unselect ')])[1]")
	private WebElement unSelect;

	public WebElement getJob_Level_Button() {
		return job_Level_Button;
	}

	public WebElement getJob_Level_Select_All() {
		return job_Level_Select_All;
	}

	public WebElement getJob_Level_Select_All_Check_Box() {
		return job_Level_Select_All_Check_Box;
	}

	public WebElement getUnSelect() {
		return unSelect;
	}
	
	

}
