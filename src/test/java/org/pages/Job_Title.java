package org.pages;

import org.base.Global;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Job_Title extends Global{
	public Job_Title() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'search-bar-title') and contains(text(),'Job Title')]")
	private WebElement job_Title;

	public WebElement getJob_Title() {
		return job_Title;
	}
	
	
}
