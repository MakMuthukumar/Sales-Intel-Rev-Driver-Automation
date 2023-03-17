package org.stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.base.Global;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pagemanager.PageObjectManager;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Steps extends Global {
	public static WebDriver driver, driver1, driver2, driver3, driver_For_LinkedIn;
	public static String firstName, lastName, expectedData;

	@Given("Launch the url")
	public void launch_the_url() throws Throwable {
		driver = getDriver("https://www.dell.com/en-in?mn=F92EfZhN4hqOM7OGItEL0xm09mut9BVcKgBk.4B62eHLvurfYmY3C");
		maximizeWindow();
		implicitWait();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
//		driver.close();
		/** To Switch into UK region */
//		launchURL("https://www.dell.com/en-uk/");
//		maximizeWindow();
//		implicitWait();
//		Thread.sleep(3000);
//		if (PageObjectManager.getInstance().getLoginPage().getRegionButton().size() != 0) {
//			clickButton(PageObjectManager.getInstance().getLoginPage().getRegionButton().get(0));
//		}
//		Thread.sleep(2000);
//		System.out.println("Switched UK Region Sucessfully");
		/** To Switch into UK region */
//		launchURL("https://www.dell.com/en-us/");
//		Thread.sleep(2000);
//		maximizeWindow();
//		implicitWait();
//		System.out.println(PageObjectManager.getInstance().getLoginPage().getRegionButton().size());
//		if(PageObjectManager.getInstance().getLoginPage().getRegionButton().size()!=0) {
//			clickButton(PageObjectManager.getInstance().getLoginPage().getRegionButton1());
//		}
//		Thread.sleep(2000);
//		System.out.println("Switched US Region Sucessfully");
	}

	@When("Click on Chrome Extensions")
	public void click_on_Chrome_Extensions() {
		waitForPageLoad();
		sikuliClickOnScreenObjects(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Image_File_Store\\Extensions.PNG");
	}

	@When("Click on RevDriver by SalesIntel")
	public void click_on_RevDriver_by_SalesIntel() {
		sikuliClickOnScreenObjects(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Image_File_Store\\RevDriverBySalesIntel.png");

	}

	@When("Enter the UserName")
	public void enter_the_UserName() {
		try {
			enterData(PageObjectManager.getInstance().getLoginPage().getUserName(),
					retrieveDataFromJson(
							System.getProperty("user.dir")
									+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
							"Login_Details", "Username"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Enter the Password")
	public void enter_the_Password() {
		try {
			enterData(PageObjectManager.getInstance().getLoginPage().getPassword(),
					retrieveDataFromJson(
							System.getProperty("user.dir")
									+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
							"Login_Details", "Password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Click on Login CTA")
	public void click_on_Login_CTA() {
		clickButton(PageObjectManager.getInstance().getLoginPage().getLoginCTA());
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(
				ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getLoginPage().getFilter()));
	}

	@When("Switch To Child Window")
	public void switch_To_Child_Window() throws Throwable {
//		driver.switchTo().frame(PageObjectManager.getInstance().getLoginPage().getSwitchTOFrame());
		maximizeWindow();
		waitForPageLoad();
		getWindowHandleForMultipleWindow();
	}

	@When("Switch To Frame")
	public void switch_To_Frame() throws Throwable {
		Thread.sleep(5000);
		driver.switchTo().frame(PageObjectManager.getInstance().getLoginPage().getSwitchTOFrame());
	}

	@When("Click on Filter Button")
	public void click_on_Filter_Button() {
		if (PageObjectManager.getInstance().getLoginPage().getFilter_List().size() != 0) {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions
					.elementToBeClickable(PageObjectManager.getInstance().getLoginPage().getFilter()));
			clickButton(PageObjectManager.getInstance().getLoginPage().getFilter());
		}

	}

	@When("Click on Contacts Email Button")
	public void click_on_Contacts_Email_Button() {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email()));
		PageObjectManager.getInstance();
		clickButton(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email());
	}

	@When("Enter the Firstname")
	public void enter_the_Firstname() throws Throwable, Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_First_Name()));
		enterData(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_First_Name(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "FirstName"));
	}

	@When("Enter the Lastname")
	public void enter_the_Lastname() throws Throwable, Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Last_Name()));
		enterData(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Last_Name(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "LastName"));
	}

	@When("Click on Search Button")
	public void click_on_Search_Button() {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Search()));
		clickButton(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Search());
	}

	@When("Click on Reveal Button")
	public void click_on_Reveal_Button() {
		if (PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Reveal_Button_List().size() != 0) {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Reveal_Button()));
			clickButton(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Reveal_Button());
		}
	}

	@When("Click on Cancel Button")
	public void click_on_Cancel_Button() {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Cancel_Button()));
		clickButton(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Cancel_Button());
	}

	@When("Wait Till Page Load To Display Select All Data")
	public void wait_Till_Page_Load_To_Display_Select_All_Data() {
		if (PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Select_All_List().size() != 0) {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Select_All()));
		}
	}

	@When("Enter the {int}nd Contacts Firstname")
	public void enter_the_nd_Contacts_Firstname(Integer int1) throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_First_Name()));
		enterData(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_First_Name(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "FirstName1"));
	}

	@When("Enter the {int}nd Contacts Lastname")
	public void enter_the_nd_Contacts_Lastname(Integer int1) throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Last_Name()));
		enterData(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Last_Name(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "LastName1"));
	}

	@When("Click on Contacts Name Email Button")
	public void click_on_Contacts_Name_Email_Button() {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Button()));
		clickButton(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Button());
	}

	@When("Enter the {int}st Contacts Email Address")
	public void enter_the_st_Contacts_Email_Address(Integer int1) throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Input_Field()));
		enterData(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Input_Field(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "Email"));
	}

	@When("Enter the {int}nd Contacts Email Address")
	public void enter_the_nd_Contacts_Email_Address(Integer int1) throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Input_Field()));
		enterData(PageObjectManager.getInstance().getContactEmailPage().getContacts_Email_Input_Field(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "Email1"));
	}

	@When("Click on Job Level Button")
	public void click_on_Job_Level_Button() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getJobLevel().getJob_Level_Button()));
		clickButton(PageObjectManager.getInstance().getJobLevel().getJob_Level_Button());
		Thread.sleep(1000);
	}

	@When("Select All Checkbox Option in Job Level")
	public void select_All_Checkbox_Option_in_Job_Level() throws Throwable {
		System.out.println(PageObjectManager.getInstance().getJobLevel().getJob_Level_Select_All().getText());
		if (PageObjectManager.getInstance().getJobLevel().getJob_Level_Select_All().getText().contains("Select All ")) {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getJobLevel().getJob_Level_Select_All_Check_Box()));
			Thread.sleep(5000);
			clickButton(PageObjectManager.getInstance().getJobLevel().getJob_Level_Select_All_Check_Box());
			Thread.sleep(2000);
		} else {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getJobLevel().getJob_Level_Select_All_Check_Box()));
			Thread.sleep(5000);
			clickButton(PageObjectManager.getInstance().getJobLevel().getJob_Level_Select_All_Check_Box());
			Thread.sleep(2000);
		}
	}

	@When("Click on Job Department Button")
	public void click_on_Job_Department_Button() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getJobDepartment().getJob_Department_Button()));
		clickButton(PageObjectManager.getInstance().getJobDepartment().getJob_Department_Button());
		Thread.sleep(1000);
	}

	@When("Select All Checkbox Option in Job Department")
	public void select_All_Checkbox_Option_in_Job_Department() throws Throwable {
		System.out.println(PageObjectManager.getInstance().getJobDepartment().getJob_Department_Select_All().getText());
		if (PageObjectManager.getInstance().getJobDepartment().getJob_Department_Select_All().getText()
				.contains("Select All ")) {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getJobDepartment().getJob_Department_Select_All_Check_Box()));
			clickButton(PageObjectManager.getInstance().getJobDepartment().getJob_Department_Select_All_Check_Box());
			Thread.sleep(1000);
		} else {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getJobDepartment().getJob_Department_Select_All_Check_Box()));
			clickButton(PageObjectManager.getInstance().getJobDepartment().getJob_Department_Select_All_Check_Box());
			Thread.sleep(1000);
		}
	}

	@When("Click on Job Title Button")
	public void click_on_Job_Title_Button() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(
				ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getJobTitle().getJob_Title()));
		clickButton(PageObjectManager.getInstance().getJobTitle().getJob_Title());
		Thread.sleep(1000);
	}

	@When("Click on Job Location Button")
	public void click_on_Job_Location_Button() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getLocation().getLocationHome()));
		clickButton(PageObjectManager.getInstance().getLocation().getLocationHome());
		Thread.sleep(1000);
	}

	@When("UnSelect All Checkbox Option in Job Level")
	public void unselect_All_Checkbox_Option_in_Job_Level() throws Throwable {
		System.out.println(PageObjectManager.getInstance().getJobLevel().getUnSelect().getText());
		if (PageObjectManager.getInstance().getJobLevel().getUnSelect().getText().contains("Unselect")) {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getJobLevel().getJob_Level_Select_All_Check_Box()));
			Thread.sleep(5000);
			clickButton(PageObjectManager.getInstance().getJobLevel().getJob_Level_Select_All_Check_Box());
			Thread.sleep(2000);
		} else {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getJobLevel().getJob_Level_Select_All_Check_Box()));
			Thread.sleep(5000);
			clickButton(PageObjectManager.getInstance().getJobLevel().getJob_Level_Select_All_Check_Box());
			Thread.sleep(2000);
		}
	}

	@When("UnSelect All Checkbox Option in Job Department")
	public void unselect_All_Checkbox_Option_in_Job_Department() throws Throwable {
		System.out.println(PageObjectManager.getInstance().getJobDepartment().getUnSelect().getText());
		if (PageObjectManager.getInstance().getJobDepartment().getUnSelect().getText().contains("Unselect")) {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getJobDepartment().getJob_Department_Select_All_Check_Box()));
			clickButton(PageObjectManager.getInstance().getJobDepartment().getJob_Department_Select_All_Check_Box());
			Thread.sleep(1000);
		} else {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getJobDepartment().getJob_Department_Select_All_Check_Box()));
			clickButton(PageObjectManager.getInstance().getJobDepartment().getJob_Department_Select_All_Check_Box());
			Thread.sleep(1000);
		}
	}

	@Then("I Wait for Page Load")
	public void i_Wait_for_Page_Load() throws Throwable {
		Thread.sleep(10000);
	}

	@When("Close the Browser")
	public void close_the_Browser() throws Throwable {
		Thread.sleep(2000);
		driver.close();
	}

	@Then("I Wait short period for Page Load")
	public void i_Wait_short_period_for_Page_Load() throws Throwable {
		Thread.sleep(5000);
	}

	@Given("Launch the url with Indian Region")
	public void launch_the_url_with_Indian_Region() throws Throwable {
		driver1 = getDriverIndianRegion("https://www.dell.com/en-in/");
		maximizeWindowIndianRegion();
		implicitWaitIndianRegion();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	@When("Switch To Frame with Indian Region")
	public void switch_To_Frame_with_Indian_Region() throws Throwable {
		Thread.sleep(5000);
		driver1.switchTo().frame(PageObjectManager.getInstance().getLogin_Page_With_Indian_Region().getSwitchTOFrame());
	}

	@When("Enter the UserName with Indian Region")
	public void enter_the_UserName_with_Indian_Region() {
		try {
			enterData(PageObjectManager.getInstance().getLogin_Page_With_Indian_Region().getUserName(),
					retrieveDataFromJson(
							System.getProperty("user.dir")
									+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
							"Login_Details", "Username"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Enter the Password with Indian Region")
	public void enter_the_Password_with_Indian_Region() {
		try {
			enterData(PageObjectManager.getInstance().getLogin_Page_With_Indian_Region().getPassword(),
					retrieveDataFromJson(
							System.getProperty("user.dir")
									+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
							"Login_Details", "Password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Click on Login CTA with Indian Region")
	public void click_on_Login_CTA_with_Indian_Region() {
		clickButton(PageObjectManager.getInstance().getLogin_Page_With_Indian_Region().getLoginCTA());
		WebDriverWait webDriverWait = new WebDriverWait(driver1, 120);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getLogin_Page_With_Indian_Region().getFilter()));
	}

	@When("Close the Browser with Indian Region")
	public void close_the_Browser_with_Indian_Region() throws Throwable {
		Thread.sleep(5000);
		driver1.close();
	}

	@Given("Launch the url with US Region")
	public void launch_the_url_with_US_Region() throws Throwable {
		driver2 = getDriverUSRegion("https://www.dell.com/en-us/");
		maximizeWindowUSRegion();
		implicitWaitUSRegion();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		if (PageObjectManager.getInstance().getLogin_Page_With_US_Region().getRegionButton().size() != 0) {
			clickButton(PageObjectManager.getInstance().getLogin_Page_With_US_Region().getRegionButton().get(0));
		}
	}

	@When("Switch To Frame with US Region")
	public void switch_To_Frame_with_US_Region() throws Throwable {
		Thread.sleep(5000);
		driver2.switchTo().frame(PageObjectManager.getInstance().getLogin_Page_With_US_Region().getSwitchTOFrame());
	}

	@When("Enter the UserName with US Region")
	public void enter_the_UserName_with_US_Region() {
		try {
			enterData(PageObjectManager.getInstance().getLogin_Page_With_US_Region().getUserName(),
					retrieveDataFromJson(
							System.getProperty("user.dir")
									+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
							"Login_Details", "Username"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Enter the Password with US Region")
	public void enter_the_Password_with_US_Region() {
		try {
			enterData(PageObjectManager.getInstance().getLogin_Page_With_US_Region().getPassword(),
					retrieveDataFromJson(
							System.getProperty("user.dir")
									+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
							"Login_Details", "Password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Click on Login CTA with US Region")
	public void click_on_Login_CTA_with_US_Region() {
		clickButton(PageObjectManager.getInstance().getLogin_Page_With_US_Region().getLoginCTA());
		WebDriverWait webDriverWait = new WebDriverWait(driver2, 120);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getLogin_Page_With_US_Region().getFilter()));
	}

	@When("Close the Browser with US Region")
	public void close_the_Browser_with_US_Region() throws Throwable {
		Thread.sleep(5000);
		driver2.quit();
	}

	@Given("Launch the url with UK Region")
	public void launch_the_url_with_UK_Region() throws Throwable {
		driver3 = getDriverUKRegion("https://www.dell.com/en-uk/");
		maximizeWindowUKRegion();
		implicitWaitUKRegion();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		if (PageObjectManager.getInstance().getLogin_Page_With_UK_Region().getRegionButton().size() != 0) {
			clickButton(PageObjectManager.getInstance().getLogin_Page_With_UK_Region().getRegionButton().get(0));
		}
	}

	@When("Switch To Frame with UK Region")
	public void switch_To_Frame_with_UK_Region() throws Throwable {
		Thread.sleep(5000);
		driver3.switchTo().frame(PageObjectManager.getInstance().getLogin_Page_With_UK_Region().getSwitchTOFrame());
	}

	@When("Enter the UserName with UK Region")
	public void enter_the_UserName_with_UK_Region() {
		try {
			enterData(PageObjectManager.getInstance().getLogin_Page_With_UK_Region().getUserName(),
					retrieveDataFromJson(
							System.getProperty("user.dir")
									+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
							"Login_Details", "Username"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Enter the Password with UK Region")
	public void enter_the_Password_with_UK_Region() {
		try {
			enterData(PageObjectManager.getInstance().getLogin_Page_With_UK_Region().getPassword(),
					retrieveDataFromJson(
							System.getProperty("user.dir")
									+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
							"Login_Details", "Password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Click on Login CTA with UK Region")
	public void click_on_Login_CTA_with_UK_Region() {
		clickButton(PageObjectManager.getInstance().getLogin_Page_With_UK_Region().getLoginCTA());
		WebDriverWait webDriverWait = new WebDriverWait(driver3, 120);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getLogin_Page_With_UK_Region().getFilter()));
	}

	@When("Close the Browser with UK Region")
	public void close_the_Browser_with_UK_Region() throws Throwable {
		Thread.sleep(5000);
		driver3.close();
	}

	@When("Click on Pin From Chrome Extensions")
	public void click_on_Pin_From_Chrome_Extensions() {
		sikuliClickOnScreenObjects(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Image_File_Store\\Pin_Image.png");
	}

	@Given("Launch the url with US Region For LinkedIn")
	public void launch_the_url_with_US_Region_For_LinkedIn() throws Throwable {
		driver_For_LinkedIn = getDriverUSRegionForLinkedIn("https://www.dell.com/en-us/");
		maximizeWindowUSRegionForLinkedIn();
		implicitWaitUSRegionForLinkedIn();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		if (PageObjectManager.getInstance().getFor_LinkedIn().getRegionButton().size() != 0) {
			clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getRegionButton().get(0));
		}
	}

	@When("Switch To Frame with US Region For LinkedIn")
	public void switch_To_Frame_with_US_Region_For_LinkedIn() throws Throwable {
		Thread.sleep(5000);
		driver_For_LinkedIn.switchTo().frame(PageObjectManager.getInstance().getFor_LinkedIn().getSwitchTOFrame());
	}

	@When("Enter the UserName with US Region For LinkedIn")
	public void enter_the_UserName_with_US_Region_For_LinkedIn() {
		try {
			enterData(PageObjectManager.getInstance().getFor_LinkedIn().getUserName(),
					retrieveDataFromJson(
							System.getProperty("user.dir")
									+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
							"Login_Details", "Username"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Enter the Password with US Region For LinkedIn")
	public void enter_the_Password_with_US_Region_For_LinkedIn() {
		try {
			enterData(PageObjectManager.getInstance().getFor_LinkedIn().getPassword(),
					retrieveDataFromJson(
							System.getProperty("user.dir")
									+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
							"Login_Details", "Password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Click on Login CTA with US Region For LinkedIn")
	public void click_on_Login_CTA_with_US_Region_For_LinkedIn() {
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLoginCTA());
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(
				ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn().getFilter()));
	}

	@When("Close the Browser with US Region For LinkedIn")
	public void close_the_Browser_with_US_Region_For_LinkedIn() throws Throwable {
		Thread.sleep(5000);
//		driver_For_LinkedIn.close();
	}

	@When("Click on Filter option with US Region For LinkedIn")
	public void click_on_Filter_option_with_US_Region_For_LinkedIn() {
		if (PageObjectManager.getInstance().getFor_LinkedIn().getFilter_List().size() != 0) {
			WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
			webDriverWait.until(ExpectedConditions
					.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn().getFilter()));
			clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getFilter());
		}
	}

	@When("Click on Contacts Name Button with US Region For LinkedIn")
	public void click_on_Contacts_Email_Button_with_US_Region_For_LinkedIn() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email()));
		PageObjectManager.getInstance();
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email());
	}

	@When("Enter the Firstname with US Region For LinkedIn")
	public void enter_the_Firstname_with_US_Region_For_LinkedIn() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_First_Name()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_First_Name(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "FirstName"));
	}

	@When("Enter the Lastname with US Region For LinkedIn")
	public void enter_the_Lastname_with_US_Region_For_LinkedIn() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_Last_Name()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_Last_Name(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "LastName"));
	}

	@When("Click on Search Button with US Region For LinkedIn")
	public void click_on_Search_Button_with_US_Region_For_LinkedIn() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_Search()));
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_Search());
		String name = retrieveDataFromJson(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
				"ContactName_Details", "FirstName")
				+ " "
				+ retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "LastName");
		Thread.sleep(2000);
		System.out.println("Data From Json File:" + name);
		System.out.println("Data From Website File:"
				+ driver_For_LinkedIn.findElement(By.xpath("//*[contains(text(),\'" + name + "\')]")).getText());

		WebDriverWait webDriverWait1 = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait1.until(ExpectedConditions.elementToBeClickable(
				driver_For_LinkedIn.findElement(By.xpath("//*[contains(text(),\'" + name + "\')]"))));
	}

	@When("Click On LinkedIn Link Contact with US Region")
	public void click_On_LinkedIn_Link_Contact_with_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Name_LinkedIn_Link()));
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Name_LinkedIn_Link());
	}

	@When("Switch To LinkedIn Website")
	public void switch_To_LinkedIn_Website() {
		String parentWindow = driver_For_LinkedIn.getWindowHandle();
		Set<String> allWindows = driver_For_LinkedIn.getWindowHandles();
		System.out.println(allWindows);
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		driver_For_LinkedIn.switchTo().window(list.get(1));
		System.out.println(driver_For_LinkedIn.getWindowHandle());
	}

	@When("Enter the Email Address In LinkedIn Website")
	public void enter_the_Email_Address_In_LinkedIn_Website() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.visibilityOf(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Email_Or_PhoneNumber_Text_Field()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Email_Or_PhoneNumber_Text_Field(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"LinkedIn_Login_Details", "Username"));
	}

	@When("Enter the Password In LinkedIn Website")
	public void enter_the_Password_In_LinkedIn_Website() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Password_Text_Field()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Password_Text_Field(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"LinkedIn_Login_Details", "Password"));
	}

	@When("Click on Agree&Join Button")
	public void click_on_Agree_Join_Button() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Agree_And_Join_Button()));
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Agree_And_Join_Button());
		WebDriverWait webDriverWait1 = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait1.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_My_Network_Text()));
	}

	@When("Click On Sign In Link In LinkedIn Website")
	public void click_On_Sign_In_Link_In_LinkedIn_Website() {
		if (driver_For_LinkedIn.findElements(By.xpath("//button[contains(text(),'Sign in')]")).size() != 0) {
			WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Sign_In_Link()));
			clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Sign_In_Link());

		}
	}

	@When("Switch To LinkedIn Website To SalesIntel Website")
	public void switch_To_LinkedIn_Website_To_SalesIntel_Website() {
		String parentWindow = driver_For_LinkedIn.getWindowHandle();
		Set<String> allWindows = driver_For_LinkedIn.getWindowHandles();
		System.out.println(allWindows);
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		driver_For_LinkedIn.switchTo().window(list.get(0));
		System.out.println(driver_For_LinkedIn.getWindowHandle());
	}

	@Then("I Wait Till My Network text to be displayed")
	public void i_Wait_Till_My_Network_text_to_be_displayed() {
		WebDriverWait webDriverWait1 = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait1.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_My_Network_Text()));
	}

	@Then("Click On LinkedIn Link Contact with US Region In SalesIntel Website")
	public void click_On_LinkedIn_Link_Contact_with_US_Region_In_SalesIntel_Website() throws Throwable {
		System.out.println(PageObjectManager.getInstance().getFor_LinkedIn()
				.getContacts_Name_LinkedIn_Link_From_Sales_Intel_Site().getText());
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getContacts_Name_LinkedIn_Link_From_Sales_Intel_Site()));
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
				.getContacts_Name_LinkedIn_Link_From_Sales_Intel_Site());

	}

	@Then("I Refresh the page")
	public void i_Refresh_the_page() {
		driver_For_LinkedIn.navigate().refresh();
	}

	@Then("Switch To LinkedIn Website To Specific Contact Details")
	public void switch_To_LinkedIn_Website_To_Specific_Contact_Details() {
		String parentWindow = driver_For_LinkedIn.getWindowHandle();
		Set<String> allWindows = driver_For_LinkedIn.getWindowHandles();
		System.out.println(allWindows);
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		driver_For_LinkedIn.switchTo().window(list.get(1));
		System.out.println(driver_For_LinkedIn.getWindowHandle());
	}

	@Then("Click on Updated RevDriver by SalesIntel")
	public void click_on_Updated_RevDriver_by_SalesIntel() {
		sikuliClickOnScreenObjects(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\Image_File_Store\\UpdatedRevDriverBySalesIntel.png");
	}

	@Then("I Wait Till Specific Contact Details to be displayed")
	public void i_Wait_Till_Specific_Contact_Details_to_be_displayed() throws Throwable {
		String name = retrieveDataFromJson(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
				"ContactName_Details", "FirstName")
				+ " "
				+ retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "LastName");
		System.out.println("Data From Json File:" + name);
		driver_For_LinkedIn.switchTo().frame(PageObjectManager.getInstance().getFor_LinkedIn().getSwitchTOFrame());
		System.out.println("Data From Website File:"
				+ driver_For_LinkedIn.findElement(By.xpath("//*[contains(text(),\'" + name + "\')]")).getText());

		WebDriverWait webDriverWait1 = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait1.until(ExpectedConditions.elementToBeClickable(
				driver_For_LinkedIn.findElement(By.xpath("//*[contains(text(),\'" + name + "\')]"))));

	}

	@Then("I Validated Contact Details from Sales Intel Site and LinkedIn Site")
	public void i_Validated_Contact_Details_from_Sales_Intel_Site_and_LinkedIn_Site() throws Throwable {
		String name = retrieveDataFromJson(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
				"ContactName_Details", "FirstName")
				+ " "
				+ retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"ContactName_Details", "LastName");
		driver_For_LinkedIn.switchTo().defaultContent();
		Assert.assertEquals(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Contact_Person_Details().getText(), name);
		System.err.println("The Actual text "
				+ PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Contact_Person_Details().getText()
				+ " and expected text " + name + ". Both are same");
	}

	@Then("I Close the current window")
	public void i_Close_the_current_window() throws Throwable {
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	@When("Click On Clear Button with US Region For LinkedIn")
	public void click_On_Clear_Button_with_US_Region_For_LinkedIn() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Clear_Button()));
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Clear_Button());
	}

	@When("Enter the Company name as Adobe in Search Field")
	public void enter_the_Company_name_as_Adobe_in_Search_Field() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Search_Button()));

		PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Search_Button().clear();

		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Search_Button(),
				retrieveJsonObjectFromJsonFile(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"Company_Name"));
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("Click On View Page with US Region In SalesIntel Website")
	public void click_On_View_Page_with_US_Region_In_SalesIntel_Website() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_View_Button()));
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_View_Button());
//		WebDriverWait webDriverWait1 = new WebDriverWait(driver_For_LinkedIn, 60);
//		webDriverWait1.until(ExpectedConditions.elementToBeClickable(
//				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Visit_Website_Button()));
	}

	@When("Click on Adobe Updated RevDriver by SalesIntel")
	public void click_on_Adobe_Updated_RevDriver_by_SalesIntel() {
		sikuliClickOnScreenObjects(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\Image_File_Store\\AdobeRevDriverBySalesIntel.png");
	}

	@Then("Validate Adobe Text For US Region In SalesIntel Website")
	public void validate_Adobe_Text_For_US_Region_In_SalesIntel_Website() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Adobe_Text()));
		Assert.assertEquals(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Adobe_Text().getText(),
				retrieveJsonObjectFromJsonFile(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"Company_Name"));

		System.err
				.println("The Actual text "
						+ PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Adobe_Text().getText()
						+ ". The Expected Text "
						+ retrieveJsonObjectFromJsonFile(System.getProperty("user.dir")
								+ "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json", "Company_Name")
						+ ". Both are same");
	}

	@Then("Get the name From SalesIntel Website In US Region")
	public void get_the_name_From_SalesIntel_Website_In_US_Region() {
		System.err.println(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Adobe_First_Customer_Name().getText());
		expectedData = PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Adobe_First_Customer_Name()
				.getText();
		/**
		 * Split the actual data(contact name) and pass the data to sales force website
		 * rev driver
		 */
		String[] split = expectedData.split(" ");
		System.out.println("Expected Data: " + expectedData);
		firstName = split[0];
		lastName = split[1];

	}

	@When("Click on Select all check box with US Region For LinkedIn")
	public void click_on_Select_all_check_box_with_US_Region_For_LinkedIn() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Select_All_Check_Box()));
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Select_All_Check_Box());
	}

	@When("Click on Export Button with US Region For LinkedIn")
	public void click_on_Export_Button_with_US_Region_For_LinkedIn() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Export_Button()));
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Export_Button());
	}

	@When("Click on Salesforce field with US Region For LinkedIn")
	public void click_on_Saleesforce_field_with_US_Region_For_LinkedIn() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Field()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Field());

	}

	@When("Enter the Username with US Region For Salesforce")
	public void enter_the_Username_with_US_Region_For_Salesforce() throws Throwable {
//		sikuliTypeOnScreenObjects(
//				System.getProperty("user.dir")
//						+ "\\src\\test\\resources\\Image_File_Store\\Salesforce_RevDriver_Username_Field.PNG",
//				retrieveDataFromJson(
//						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
//						"Salesforce_Login_Details", "Username"));
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyRelease(KeyEvent.VK_Y);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyRelease(KeyEvent.VK_Y);
		robot.keyPress(KeyEvent.VK_DECIMAL);
		robot.keyRelease(KeyEvent.VK_DECIMAL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);

	}

	@When("Enter the Password with US Region For Salesforce")
	public void enter_the_Password_with_US_Region_For_Salesforce() throws Throwable {
//		sikuliTypeOnScreenObjects(
//				System.getProperty("user.dir")
//						+ "\\src\\test\\resources\\Image_File_Store\\Salesforce_RevDriver_Password_Field.png",
//				retrieveDataFromJson(
//						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
//						"Salesforce_Login_Details", "Password"));
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}

	@When("Click on Login Button with US Region For Salesforce")
	public void click_on_Login_Button_with_US_Region_For_Salesforce() throws Throwable {
//		sikuliClickOnScreenObjects(System.getProperty("user.dir")
//				+ "\\src\\test\\resources\\Image_File_Store\\Salesforce_RevDriver_Login_Button.png");
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("Click on Rev Driver Icon with US Region For Salesforce")
	public void click_on_Rev_Driver_Icon_with_US_Region_For_Salesforce() {
		sikuliClickOnScreenObjects(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Image_File_Store\\Salesforce_RevDriver.png");
	}

	@When("Click on Select the Specific check box with US Region For LinkedIn")
	public void click_on_Select_the_Specific_check_box_with_US_Region_For_LinkedIn() {
		if (!PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Already_Revealed_Details_Checkbox().isSelected()) {
			System.out.println("Check Box Status: " + PageObjectManager.getInstance().getFor_LinkedIn()
					.getLinkedIn_Website_Salesforce_Already_Revealed_Details_Checkbox().isSelected());
			clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
					.getLinkedIn_Website_Salesforce_Already_Revealed_Details_Checkbox());
		} else if (!PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_UrRevealed_Details_Checkbox().isSelected()) {
			System.out.println(PageObjectManager.getInstance().getFor_LinkedIn()
					.getLinkedIn_Website_Salesforce_UrRevealed_Details_Checkbox().isSelected());
			clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
					.getLinkedIn_Website_Salesforce_UrRevealed_Details_Checkbox());
		}
	}

	@When("Click on Export as Contact with US Region For LinkedIn")
	public void click_on_Export_as_Contact_with_US_Region_For_LinkedIn() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Export_as_Contact_Label()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Export_as_Contact_Label());
	}

	@When("Click on Next Button in Contact Owner optional Page with US Region For LinkedIn")
	public void click_on_Next_Button_in_Contact_Owner_optional_Page_with_US_Region_For_LinkedIn() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Next_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Next_Button());
	}

	@When("Click on Next Button in Campaigns optional Page with US Region For LinkedIn")
	public void click_on_Next_Button_in_Campaigns_optional_Page_with_US_Region_For_LinkedIn() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Next_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Next_Button());
	}

	@When("Click on Next Button in Duplicates Page with US Region For LinkedIn")
	public void click_on_Next_Button_in_Duplicates_Page_with_US_Region_For_LinkedIn() throws Throwable {
		int size = PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Duplicate_Next_Button().size();
		if (size != 0) {
			WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Next_Button()));
			Thread.sleep(2000);
			clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Next_Button());
		}
	}

	@When("Click on Close Button in Export Succeeded Page with US Region For LinkedIn")
	public void click_on_Close_Button_in_Export_Succeeded_Page_with_US_Region_For_LinkedIn() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Close_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Close_Button());
	}

	@Given("Open the New Tap and Launch the Salesforce Website Using US Region")
	public void open_the_New_Tap_and_Launch_the_Salesforce_Website_Using_US_Region() throws Throwable {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		String parentWindow = driver_For_LinkedIn.getWindowHandle();
		Set<String> allWindows = driver_For_LinkedIn.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		driver_For_LinkedIn.switchTo().window(list.get(2));
		driver_For_LinkedIn.navigate().to("https://login.salesforce.com/?locale=in");
		Thread.sleep(3000);
	}

	@When("Enter the Username in Salesforce Website Using US Region")
	public void enter_the_Username_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.visibilityOf(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Username_Field()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Username_Field(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"Salesforce_Login_Details", "Username"));
	}

	@When("Enter the Password in Salesforce Website Using US Region")
	public void enter_the_Password_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.visibilityOf(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Password_Field()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Password_Field(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"Salesforce_Login_Details", "Password"));
	}

	@When("Click on login button after entering the credentials in Salesforce Website Using US Region")
	public void click_on_login_button_after_entering_the_credentials_in_Salesforce_Website_Using_US_Region()
			throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Login_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Login_Button());
		Thread.sleep(15000);
	}

	@When("Click on Home Button in Salesforce Website Using US Region")
	public void click_on_Home_Button_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Home_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Home_Button());
	}

	@When("Click on Salesforce Updated RevDriver by SalesIntel")
	public void click_on_Salesforce_Updated_RevDriver_by_SalesIntel() throws Throwable {
		Thread.sleep(2000);
		sikuliClickOnScreenObjects(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\Image_File_Store\\AdobeRevDriverBySalesIntel.png");
	}

	@Then("Validate the customer name from Home page in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Home_page_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Home Page: " + PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@When("Switch From Frame To Webpage in Salesforce Website Using US Region")
	public void switch_From_Frame_To_Webpage_in_Salesforce_Website_Using_US_Region() throws Throwable {
		Thread.sleep(5000);
		driver_For_LinkedIn.switchTo().defaultContent();
	}

	@When("Click on Account Button in Salesforce Website Using US Region")
	public void click_on_Account_Button_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Accounts_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Accounts_Button());
	}

	@Then("Validate the customer name from Account page in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Account_page_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Account Page: " + PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@When("Click on Account Page-My Accounts Dropdown in Salesforce Website Using US Region")
	public void click_on_Account_Page_My_Accounts_Dropdown_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Drop_Down()));
		Thread.sleep(2000);
		Select select = new Select(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Drop_Down());
		select.selectByVisibleText("My Accounts");
	}

	@Then("Validate the customer name from Account page-My Accounts Dropdown in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Account_page_My_Accounts_Dropdown_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Account page-My Accounts Dropdown Option: " + PageObjectManager
				.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@When("Click on Contacts Button in Salesforce Website Using US Region")
	public void click_on_Contacts_Button_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Contacts_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Contacts_Button());
	}

	@Then("Validate the customer name from Contacts page in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Contacts_page_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Contacts page: " + PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@When("Click on Contacts Page-My Accounts Dropdown in Salesforce Website Using US Region")
	public void click_on_Contacts_Page_My_Accounts_Dropdown_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Drop_Down()));
		Thread.sleep(2000);
		Select select = new Select(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Drop_Down());
		select.selectByVisibleText("Recently Viewed Contacts");
	}

	@Then("Validate the customer name from Contacts page-Recently Viewed Contacts Dropdown in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Contacts_page_Recently_Viewed_Contacts_Dropdown_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println(
				"Customer Name From Contacts page-Recently Viewed Contacts Dropdown Option: " + PageObjectManager
						.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@When("Click on Leads Button in Salesforce Website Using US Region")
	public void click_on_Leads_Button_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Leads_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Leads_Button());
	}

	@Then("Validate the customer name from Leads page in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Leads_page_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Leads page: " + PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@When("Click on Leads Page-All Open Leads Dropdown in Salesforce Website Using US Region")
	public void click_on_Leads_Page_All_Open_Leads_Dropdown_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Drop_Down()));
		Thread.sleep(2000);
		Select select = new Select(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Drop_Down());
		select.selectByVisibleText("All Open Leads");
	}

	@Then("Validate the customer name from Leads page-All Open Leads Dropdown in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Leads_page_All_Open_Leads_Dropdown_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Leads page-All Open Leads Dropdown Option: " + PageObjectManager
				.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@When("Click on Switch to Lightning Experience Label in Salesforce Website Using US Region")
	public void click_on_Switch_to_Lightning_Experience_Label_in_Salesforce_Website_Using_US_Region() throws Throwable {
		Thread.sleep(5000);
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience());

	}

	@When("Click on Switch to Lightning Experience-Home label in Salesforce Website Using US Region")
	public void click_on_Switch_to_Lightning_Experience_Home_label_in_Salesforce_Website_Using_US_Region()
			throws Throwable {
		Thread.sleep(3000);
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Home()));
		Thread.sleep(2000);
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Home());
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor.executeScript("arguments[0].click();", PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Home());

	}

	@When("Click on Switch to Lightning Experience-Accounts label in Salesforce Website Using US Region")
	public void click_on_Switch_to_Lightning_Experience_Accounts_label_in_Salesforce_Website_Using_US_Region()
			throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts()));
		Thread.sleep(2000);
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts());
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor.executeScript("arguments[0].click();", PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts());

	}

	@Then("Validate the customer name from Accounts page in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Accounts_page_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Accounts page(Switch to Lightning Experience): " + PageObjectManager
				.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name().getText());

	}

	@When("Click on Switch to Lightning Experience-My Accounts label in Salesforce Website Using US Region")
	public void click_on_Switch_to_Lightning_Experience_My_Accounts_label_in_Salesforce_Website_Using_US_Region()
			throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts_Button()));
		Thread.sleep(2000);
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts_Button());
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor.executeScript("arguments[0].click();", PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts_Button());
		WebDriverWait webDriverWait1 = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait1.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_My_Accounts_Label()));
		Thread.sleep(2000);
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_My_Accounts_Label());
		JavascriptExecutor javascriptExecutor1 = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor1.executeScript("arguments[0].click();", PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_My_Accounts_Label());
	}

	@Then("Validate the customer name from Accounts page-My Accounts in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Accounts_page_My_Accounts_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Accounts page-My Accounts Option(Switch to Lightning Experience): "
				+ PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()
						.getText());
	}

	@When("Click on Switch to Lightning Experience-Contacts label in Salesforce Website Using US Region")
	public void click_on_Switch_to_Lightning_Experience_Contacts_label_in_Salesforce_Website_Using_US_Region()
			throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts()));
		Thread.sleep(2000);
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts());
		JavascriptExecutor javascriptExecutor1 = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor1.executeScript("arguments[0].click();", PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts());
	}

	@When("Click on Switch to Lightning Experience-Recently Viewed Contacts label in Salesforce Website Using US Region")
	public void click_on_Switch_to_Lightning_Experience_Recently_Viewed_Contacts_label_in_Salesforce_Website_Using_US_Region()
			throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts_Button()));
		Thread.sleep(2000);
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts_Button());
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor.executeScript("arguments[0].click();", PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts_Button());
		WebDriverWait webDriverWait1 = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait1.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Recently_Viewed_Contacts_Label()));
		Thread.sleep(2000);
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Recently_Viewed_Contacts_Label());
		JavascriptExecutor javascriptExecutor1 = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor1.executeScript("arguments[0].click();", PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Recently_Viewed_Contacts_Label());
	}

	@Then("Validate the customer name from Contacts page-Recently Viewed Contacts in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Contacts_page_Recently_Viewed_Contacts_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println(
				"Customer Name From Contacts page-Recently Viewed Contacts Option(Switch to Lightning Experience): "
						+ PageObjectManager.getInstance().getFor_LinkedIn()
								.getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@When("Click on Switch to Lightning Experience-Leads label in Salesforce Website Using US Region")
	public void click_on_Switch_to_Lightning_Experience_Leads_label_in_Salesforce_Website_Using_US_Region()
			throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads()));
		Thread.sleep(2000);
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads());
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor.executeScript("arguments[0].click();", PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads());
	}

	@Then("Validate the customer name from Leads page-All Open Leads in Salesforce Website Using US Region")
	public void validate_the_customer_name_from_Leads_page_All_Open_Leads_in_Salesforce_Website_Using_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Leads page-All Open Leads Option(Switch to Lightning Experience): "
				+ PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()
						.getText());
	}

	@When("Click on Switch to Lightning Experience-All Open Leads label in Salesforce Website Using US Region")
	public void click_on_Switch_to_Lightning_Experience_All_Open_Leads_label_in_Salesforce_Website_Using_US_Region()
			throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads_Button()));
		Thread.sleep(2000);
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads_Button());
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor.executeScript("arguments[0].click();", PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads_Button());
		WebDriverWait webDriverWait1 = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait1.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_All_Open_Leads_Label()));
		Thread.sleep(2000);
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_All_Open_Leads_Label());
		JavascriptExecutor javascriptExecutor1 = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor1.executeScript("arguments[0].click();", PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_All_Open_Leads_Label());
	}

	@When("Click on Close Icon, If appears in Salesforce Website Using US Region")
	public void click_on_Close_Icon_If_appears_in_Salesforce_Website_Using_US_Region() {
		if (PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Close_Icon().size() != 0) {
			WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance()
					.getFor_LinkedIn().getLinkedIn_Website_Salesforce_Close_Icon().get(0)));
			clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Close_Icon()
					.get(0));

		}
		if (PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Second_Close_Icon()
				.size() != 0) {
			WebDriverWait webDriverWait1 = new WebDriverWait(driver_For_LinkedIn, 60);
			webDriverWait1.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance()
					.getFor_LinkedIn().getLinkedIn_Website_Salesforce_Second_Close_Icon().get(0)));
			clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
					.getLinkedIn_Website_Salesforce_Second_Close_Icon().get(0));
		}
	}

	@When("Click on Remember me checkbox in Salesforce Website Using US Region")
	public void click_on_Remember_me_checkbox_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Remember_Me_Check_Box_Field()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Remember_Me_Check_Box_Field());
	}

//	@Then("Validate the Exported contact displayed in Salesforce Website")
//	public void validate_the_Exported_contact_displayed_in_Salesforce_Website() {
//		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
//		webDriverWait.until(ExpectedConditions.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn()
//				.getLinkedIn_Website_Salesforce_List_Section()));
//		System.err.println(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_App_Message_Filters().getText());
//	}

	@When("Enter the Firstname as Exported First Name with US Region For LinkedIn")
	public void enter_the_Firstname_as_Exported_First_Name_with_US_Region_For_LinkedIn() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_First_Name()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_First_Name(), firstName);
	}

	@When("Enter the Lastname as Exported Last Name with US Region For LinkedIn")
	public void enter_the_Lastname_as_Exported_First_Name_with_US_Region_For_LinkedIn() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_Last_Name()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_Last_Name(), lastName);
	}

	@When("Click on Search Button for Exported Name in Salesforce Website Using US Region")
	public void click_on_Search_Button_for_Exported_Name_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions
				.elementToBeClickable(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_Search()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getContacts_Email_Search());
	}

	@When("Click on Setting menu in Salesforce Website Using US Region")
	public void click_on_Setting_menu_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Settings_Menu()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Settings_Menu());
	}
	
	
	@When("Click on Integrations Settingsin Salesforce Website Using US Region")
	public void click_on_Integrations_Settingsin_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Integrations_Settings_Menu()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Integrations_Settings_Menu());
	}
	
	@When("Click on Salesforce Setting in Salesforce Website Using US Region")
	public void click_on_Salesforce_Setting_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Settings_Menu()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Settings_Menu());
	}

	@When("Click on Logout in Salesforce Website Using US Region")
	public void click_on_Logout_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Logout_Button()));
		Thread.sleep(2000);
		JavascriptExecutor javascriptExecutor1 = (JavascriptExecutor) driver_For_LinkedIn;
		javascriptExecutor1.executeScript("arguments[0].click();",
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Logout_Button());
//		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Logout_Button());
	}

	@When("Wait for Specific contact in Salesforce Website Using US Region")
	public void wait_for_Specific_contact_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		Thread.sleep(1000);
	}

	@When("Click on Already logged in Salesforce account in Salesforce Website Using US Region")
	public void click_on_Already_logged_in_Salesforce_account_in_Salesforce_Website_Using_US_Region() throws Throwable {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("Click on Cancel in Salesforce Website Using US Region")
	public void click_on_Cancel_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cancel_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cancel_Button());
	}

	@When("Switch To Salesforce Website")
	public void switch_To_Salesforce_Website() {
		String parentWindow = driver_For_LinkedIn.getWindowHandle();
		Set<String> allWindows = driver_For_LinkedIn.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		driver_For_LinkedIn.switchTo().window(list.get(2));
	}

	@When("Enter the Exported data in search box in Salesforce Website Using US Region")
	public void enter_the_Exported_data_in_search_box_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.visibilityOf(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Search_Text_Field()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Search_Text_Field(),
				expectedData);
		WebDriverWait webDriverWait1 = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait1.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Search_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Search_Button());
	}

	@Then("Validated the Exported data in Salesforce Website Using US Region")
	public void validated_the_Exported_data_in_Salesforce_Website_Using_US_Region() {
		String actualText = driver_For_LinkedIn.findElement(By.xpath("//a[contains(text(),\'" + firstName + "\')]"))
				.getText();
		System.err.println(actualText);
		Assert.assertEquals(actualText, expectedData);
	}

	@Then("Validate the Exported contact displayed in Salesforce Website")
	public void validate_the_Exported_contact_displayed_in_Salesforce_Website() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.visibilityOf(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Adobe_First_Customer_Name()));
		System.err.println(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Adobe_First_Customer_Name().getText());
		Assert.assertEquals(PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Adobe_First_Customer_Name().getText(), expectedData);
	}

	@When("Click on OK in Salesforce Website Using US Region")
	public void click_on_OK_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_OK_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_OK_Button());
	}

	@When("Enter the Job Description Details as IT Head  in Search Field")
	public void enter_the_Job_Description_Details_as_IT_Head_in_Search_Field() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Search_Button()));

		PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Search_Button().clear();

		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Search_Button(),
				retrieveJsonObjectFromJsonFile(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"Job Description"));
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("Get the Customer name From SalesIntel Website")
	public void get_the_Customer_name_From_SalesIntel_Website() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name: " + PageObjectManager.getInstance().getFor_LinkedIn()
				.getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@Then("Validated the Company details in Salesforce Website Using US Region")
	public void validated_the_Company_details_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions
				.visibilityOf(PageObjectManager.getInstance().getFor_LinkedIn().getSalesforce_Adobe_Company_Name()));
		System.err.println("Company Name From Salesforce Website: "
				+ PageObjectManager.getInstance().getFor_LinkedIn().getSalesforce_Adobe_Company_Name().getText());
		Assert.assertEquals(
				PageObjectManager.getInstance().getFor_LinkedIn().getSalesforce_Adobe_Company_Name().getText(),
				retrieveJsonObjectFromJsonFile(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"Company_Name"));
	}

	@Then("Validated the Company details in Salesforce Rev Driver Using US Region")
	public void validated_the_Company_details_in_Salesforce_Rev_Driver_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getSalesforce_Rev_Driver_Adobe_Company_Name()));
		System.err.println("Company Name From Salesforce Rev Driver: " + PageObjectManager.getInstance()
				.getFor_LinkedIn().getSalesforce_Rev_Driver_Adobe_Company_Name().getText());

		Assert.assertEquals(
				PageObjectManager.getInstance().getFor_LinkedIn().getSalesforce_Rev_Driver_Adobe_Company_Name()
						.getText(),
				retrieveJsonObjectFromJsonFile(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"Company_Name"));
	}

	@When("Enter the data as IT Head in search box in Salesforce Website Using US Region")
	public void enter_the_data_as_IT_Head_in_search_box_in_Salesforce_Website_Using_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Search_Text_Field()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Search_Text_Field(),
				"IT Head");
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Search_Button());
	}

	@When("Click On Me Button in LinkedIn Website")
	public void click_On_Me_Button_in_LinkedIn_Website() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Me_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Me_Button());
	}

	@When("Click On Sign Out Button in LinkedIn Website")
	public void click_On_Sign_Out_Button_in_LinkedIn_Website() throws Throwable {
		waitForPageLoad();
		sikuliClickOnScreenObjects(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Image_File_Store\\Sign_Out.png");
		Thread.sleep(1000);
		if (driver_For_LinkedIn.findElements(By.xpath("//*[contains(text(),'Sign Out')]")).size() != 0) {
			clickButton(driver_For_LinkedIn.findElements(By.xpath("//*[contains(text(),'Sign Out')]")).get(0));
		}
	}

	@When("Enter The User Nmae in LinkedIn Website For Sales Navigator with US Region")
	public void enter_The_User_Nmae_in_LinkedIn_Website_For_Sales_Navigator_with_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.visibilityOf(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_User_Name_Input_Field()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_User_Name_Input_Field(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"LinkedIn_Login_Details", "Sales Navigator Username"));
	}

	@When("Enter The Password in LinkedIn Website For Sales Navigator with US Region")
	public void enter_The_Password_in_LinkedIn_Website_For_Sales_Navigator_with_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.visibilityOf(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Password_Input_Field()));
		enterData(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Password_Input_Field(),
				retrieveDataFromJson(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Json_Data_Storage\\Json_Data.json",
						"LinkedIn_Login_Details", "Sales Navigator Password"));
	}

	@When("Click On Submit Button For Sales Navigator with US Region")
	public void click_On_Submit_Button_For_Sales_Navigator_with_US_Region() throws Throwable {
		
		Thread.sleep(5000);
		if(driver.findElements(By.xpath("//span[text()='Sign out']")).size()!=0) {
			driver.findElements(By.xpath("//span[text()='Sign out']")).get(0).click();
		}
		
		if(driver.findElements(By.xpath("//button[@class='sign-in-form__submit-button']")).size()!=0) {
			WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Submit_Button()));
			Thread.sleep(2000);
			clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Submit_Button());
			Thread.sleep(1000);
		}
		
		if(driver.findElements(By.xpath("//button[@class='sign-in-form__submit-button']")).size()!=0) {
			WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(
					PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Submit_Button()));
			Thread.sleep(2000);
			clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Submit_Button());
			Thread.sleep(1000);
		}
		
		if(driver.findElements(By.xpath("//button[@type='submit']")).size()!=0) {
			driver.findElements(By.xpath("//button[@type='submit']']")).get(0).click();
		}
		
		Thread.sleep(2000);
	}

	@When("Click On Work Button in LinkedIn Website")
	public void click_On_Work_Button_in_LinkedIn_Website() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Work_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Work_Button());
		Thread.sleep(1000);
	}

	@When("Click On Sales Nav Button in LinkedIn Website")
	public void click_On_Sales_Nav_Button_in_LinkedIn_Website() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Sales_Nav_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Sales_Nav_Button());
		Thread.sleep(1000);
	}

	@When("Switch To Sales Navigator Website")
	public void switch_To_Sales_Navigator_Website() {
		driver_For_LinkedIn.switchTo().window("Home | Sales Navigator");
		System.out.println("Switch To Sales Navigator Website: " + driver_For_LinkedIn.getTitle());
	}

	@When("Click On Home Button For Sales Navigator with US Region")
	public void click_On_Home_Buuton_For_Sales_Navigator_with_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getSales_Navigator_Home_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getSales_Navigator_Home_Button());
		Thread.sleep(1000);
	}

	@When("Get The Home First Customer Name From Rev Driver For Sales Navigator with US Region")
	public void get_The_Home_First_Customer_Name_From_Rev_Driver_For_Sales_Navigator_with_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Home Page-Sales Navigator: " + PageObjectManager.getInstance()
				.getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@When("Click On Accounts Button For Sales Navigator with US Region")
	public void click_On_Accounts_Buuton_For_Sales_Navigator_with_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getSales_Navigator_Accounts_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getSales_Navigator_Accounts_Button());
		Thread.sleep(1000);
	}

	@When("Get The Accounts First Customer Name From Rev Driver For Sales Navigator with US Region")
	public void get_The_Accounts_First_Customer_Name_From_Rev_Driver_For_Sales_Navigator_with_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Accounts Page-Sales Navigator: " + PageObjectManager.getInstance()
				.getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

	@When("Click On Leads Button For Sales Navigator with US Region")
	public void click_On_Leads_Buuton_For_Sales_Navigator_with_US_Region() throws Throwable {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 120);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getSales_Navigator_Leads_Button()));
		Thread.sleep(2000);
		clickButton(PageObjectManager.getInstance().getFor_LinkedIn().getSales_Navigator_Leads_Button());
		Thread.sleep(1000);
	}

	@When("Get The Leads First Customer Name From Rev Driver For Sales Navigator with US Region")
	public void get_The_Leads_First_Customer_Name_From_Rev_Driver_For_Sales_Navigator_with_US_Region() {
		WebDriverWait webDriverWait = new WebDriverWait(driver_For_LinkedIn, 60);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(
				PageObjectManager.getInstance().getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name()));
		System.err.println("Customer Name From Leads Page-Sales Navigator: " + PageObjectManager.getInstance()
				.getFor_LinkedIn().getLinkedIn_Website_Salesforce_Cutomer_name().getText());
	}

}
