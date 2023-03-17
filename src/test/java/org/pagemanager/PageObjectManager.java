package org.pagemanager;

import org.pages.Contact_Email_Page;
import org.pages.Job_Department;
import org.pages.Job_Level;
import org.pages.Job_Title;
import org.pages.Location;
import org.pages.LoginPage;
import org.pages.Login_Page_With_Indian_Region;
import org.pages.Login_Page_With_UK_Region;
import org.pages.Login_Page_With_US_Region;
import org.pages.Login_Page_With_US_Region_For_LinkedIn;

public class PageObjectManager {
	private static PageObjectManager pageObjectManager;
	private LoginPage loginPage;
	private Login_Page_With_Indian_Region login_Page_With_Indian_Region;
	private Login_Page_With_US_Region login_Page_With_US_Region;
	private Login_Page_With_US_Region_For_LinkedIn login_Page_With_US_Region_for_LinkedIn;
	private Login_Page_With_UK_Region login_Page_With_UK_Region;
	private Contact_Email_Page contactEmailPage;
	private Job_Level jobLevel;
	private Job_Department jobDepartment;
	private Job_Title jobTitle;
	private Location location;

	private PageObjectManager() {

	}

	public static PageObjectManager getInstance() {
		return (pageObjectManager == null) ? pageObjectManager = new PageObjectManager() : pageObjectManager;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public Contact_Email_Page getContactEmailPage() {
		return (contactEmailPage == null) ? contactEmailPage = new Contact_Email_Page() : contactEmailPage;
	}

	public Job_Level getJobLevel() {
		return (jobLevel == null) ? jobLevel = new Job_Level() : jobLevel;
	}

	public Job_Department getJobDepartment() {
		return (jobDepartment == null) ? jobDepartment = new Job_Department() : jobDepartment;
	}

	public Job_Title getJobTitle() {
		return (jobTitle == null) ? jobTitle = new Job_Title() : jobTitle;
	}

	public Location getLocation() {
		return (location == null) ? location = new Location() : location;
	}

	public Login_Page_With_Indian_Region getLogin_Page_With_Indian_Region() {
		return (login_Page_With_Indian_Region == null)
				? login_Page_With_Indian_Region = new Login_Page_With_Indian_Region()
				: login_Page_With_Indian_Region;
	}

	public Login_Page_With_US_Region getLogin_Page_With_US_Region() {
		return (login_Page_With_US_Region == null) ? login_Page_With_US_Region = new Login_Page_With_US_Region()
				: login_Page_With_US_Region;
	}

	public Login_Page_With_UK_Region getLogin_Page_With_UK_Region() {
		return (login_Page_With_UK_Region == null) ? login_Page_With_UK_Region = new Login_Page_With_UK_Region()
				: login_Page_With_UK_Region;
	}

	public Login_Page_With_US_Region_For_LinkedIn getFor_LinkedIn() {
		return (login_Page_With_US_Region_for_LinkedIn == null)
				? login_Page_With_US_Region_for_LinkedIn = new Login_Page_With_US_Region_For_LinkedIn()
				: login_Page_With_US_Region_for_LinkedIn;
	}

}
