package org.pages;

import java.util.List;

import org.base.Global;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_With_US_Region_For_LinkedIn extends Global {
	public Login_Page_With_US_Region_For_LinkedIn() {
		PageFactory.initElements(driver_For_LinkedIn, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement userName;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Log In')]")
	private WebElement loginCTA;

	@FindBy(id = "rev_driver")
	private WebElement switchTOFrame;

	@FindBy(xpath = "//button[contains(text(),'Filters')]")
	private WebElement filter;

	@FindBy(xpath = "//button[contains(text(),'Filters')]")
	private List<WebElement> filter_List;

	@FindBy(id = "ooc-destination-country")
	private List<WebElement> regionButton;

	@FindBy(xpath = "//*[@destination-country-code='us']")
	private WebElement regionButton1;

	@FindBy(xpath = "(//span[contains(@class,'search-bar-title') and contains(text(),'Contact')])[1]")
	private WebElement contacts_Email;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement contacts_Email_First_Name;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement contacts_Email_Last_Name;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement contacts_Email_Search;

	@FindBy(xpath = "//button[contains(text(),'Reveal')]")
	private WebElement contacts_Email_Reveal_Button;

	@FindBy(xpath = "//button[contains(text(),'Reveal')]")
	private List<WebElement> contacts_Email_Reveal_Button_List;

	@FindBy(xpath = "//*[@fill='url(#pattern0)']")
	private WebElement contacts_Email_Cancel_Button;

	@FindBy(xpath = "//*[contains(text(),' Select All ')]")
	private WebElement contacts_Email_Select_All;

	@FindBy(xpath = "//button[contains(text(),'Reveal')]")
	private List<WebElement> contacts_Email_Select_All_List;

	@FindBy(xpath = "//a[contains(@href,'https://linkedin.com/in/')]")
	private WebElement contacts_Name_LinkedIn_Link;

	@FindBy(xpath = "//span[contains(text(),'linkedin.com/in/')]")
	private WebElement contacts_Name_LinkedIn_Link_From_Sales_Intel_Site;

	@FindBy(xpath = "//input[@id='session_key']")
	private WebElement linkedIn_Email_Or_PhoneNumber_Text_Field;

	@FindBy(xpath = "//input[@id='session_password']")
	private WebElement linkedIn_Password_Text_Field;

	@FindBy(xpath = "(//button[contains(text(),'Sign in')])[2]")
	private WebElement linkedIn_Agree_And_Join_Button;

	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	private WebElement linkedIn_Sign_In_Link;

	@FindBy(xpath = "//span[@title='My Network']")
	private WebElement linkedIn_My_Network_Text;

	@FindBy(xpath = "//h1[contains(@class,'text-heading-xlarge inline t-24 v-align-middle break-words')]")
	private WebElement linkedIn_Contact_Person_Details;

	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	private WebElement linkedIn_Clear_Button;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement linkedIn_Website_Search_Button;

	@FindBy(xpath = "(//a[@class='app-aware-link artdeco-button artdeco-button--default artdeco-button--2 artdeco-button--secondary' or @href='https://www.linkedin.com/company/adobe/'])[4]")
	private WebElement linkedIn_Website_View_Button;

	@FindBy(xpath = "//button[@id='ember253' or contains(text(),'More')]")
	private WebElement linkedIn_Website_Visit_Website_Button;

	@FindBy(xpath = "(//a[contains(text(),'Adobe')])[1]")
	private WebElement linkedIn_Website_Adobe_Text;

	@FindBy(xpath = "(//div[@class='ni-name-div'])[1]")
	private WebElement linkedIn_Website_Adobe_First_Customer_Name;

	@FindBy(xpath = "//input[@checked='!selection.isSelectedAll']")
	private WebElement linkedIn_Website_Select_All_Check_Box;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'Export')])[1]")
	private WebElement linkedIn_Website_Export_Button;

	@FindBy(xpath = "//a[@class='dropdown-item' and contains(text(),'Salesforce')]")
	private WebElement linkedIn_Website_Salesforce_Field;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement linkedIn_Website_Salesforce_Username_Field;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement linkedIn_Website_Salesforce_Password_Field;

	@FindBy(xpath = "//input[@type='checkbox' and @name='rememberUn']")
	private WebElement linkedIn_Website_Salesforce_Remember_Me_Check_Box_Field;

	@FindBy(xpath = "//input[@id='Login']")
	private WebElement linkedIn_Website_Salesforce_Login_Button;

	@FindBy(xpath = "(//input[@type='checkbox' and contains(@triggers,'pointerenter:pointerout')])[1]")
	private WebElement linkedIn_Website_Salesforce_Already_Revealed_Details_Checkbox;

	@FindBy(xpath = "(//input[@type='checkbox' and contains(@class,'ng-untouched ng-pristine ng-valid')])[1]")
	private WebElement linkedIn_Website_Salesforce_UrRevealed_Details_Checkbox;

	@FindBy(xpath = "//h6[text()='Export Type']")
	private WebElement linkedIn_Website_Salesforce_Export_Type_Label;

	@FindBy(xpath = "//td[contains(text(),'Export as Lead')]")
	private WebElement linkedIn_Website_Salesforce_Export_as_Lead_Label;

	@FindBy(xpath = "//td[contains(text(),'Export as Contact')]")
	private WebElement linkedIn_Website_Salesforce_Export_as_Contact_Label;

	@FindBy(xpath = "//button[@type='button' and text()='Next']")
	private WebElement linkedIn_Website_Salesforce_Next_Button;
	
	@FindBy(xpath = "//button[@type='button' and text()='Next']")
	private  List<WebElement> linkedIn_Website_Salesforce_Duplicate_Next_Button;

	@FindBy(xpath = "//button[@type='button' and text()='Close']")
	private WebElement linkedIn_Website_Salesforce_Close_Button;

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement linkedIn_Website_Salesforce_Home_Button;

	@FindBy(xpath = "//a[contains(text(),'Accounts')]")
	private WebElement linkedIn_Website_Salesforce_Accounts_Button;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	private WebElement linkedIn_Website_Salesforce_Contacts_Button;

	@FindBy(xpath = "//a[contains(text(),'Leads')]")
	private WebElement linkedIn_Website_Salesforce_Leads_Button;

	@FindBy(xpath = "//select[@id='fcf']")
	private WebElement linkedIn_Website_Salesforce_Drop_Down;

	@FindBy(xpath = "(//div[@class='ni-name-div'])[1]")
	private WebElement linkedIn_Website_Salesforce_Cutomer_name;

	@FindBy(xpath = "(//a[contains(text(),'Switch to Lightning Experience')])[1]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience;

	@FindBy(xpath = "//a[contains(@title,'Home')]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Home;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts;

	@FindBy(xpath = "//span[contains(text(),'Accounts')]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts;

	@FindBy(xpath = "//span[@class='slds-truncate' and contains(text(),'Leads')]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads;

	@FindBy(xpath = "(//span[contains(text(),'Contacts')]//following::a[@role='button'])[1]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts_Button;

	@FindBy(xpath = "(//span[contains(text(),'Accounts')]//following::a[@role='button'])[1]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts_Button;

	@FindBy(xpath = "(//span[contains(text(),'Leads')]//following::a[@role='button'])[1]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads_Button;

	@FindBy(xpath = "//span[contains(text(),'Recently Viewed Contacts')]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Recently_Viewed_Contacts_Label;

	@FindBy(xpath = "//span[contains(text(),'My Accounts')]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_My_Accounts_Label;

	@FindBy(xpath = "//span[contains(text(),'All Open Leads')]")
	private WebElement linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_All_Open_Leads_Label;

	@FindBy(xpath = "//button[@title='Close this window']")
	private List<WebElement> linkedIn_Website_Salesforce_Close_Icon;

	@FindBy(xpath = "//a[@id='tryLexDialogX']")
	private List<WebElement> linkedIn_Website_Salesforce_Second_Close_Icon;
	
	@FindBy(xpath = "//div[@class='list-section']")
	private WebElement linkedIn_Website_Salesforce_List_Section;
	
	@FindBy(tagName = "app-message-filters")
	private WebElement linkedIn_Website_Salesforce_App_Message_Filters;
	
	@FindBy(xpath = "//button[@type='button' and @class='btn']")
	private WebElement linkedIn_Website_Settings_Menu;
	
	@FindBy(xpath = "//span[contains(text(),' Integrations Settings ')]")
	private WebElement linkedIn_Website_Integrations_Settings_Menu;
	
	@FindBy(xpath = "//a[contains(text(),'Salesforce Settings')]")
	private WebElement linkedIn_Website_Salesforce_Settings_Menu;
	
	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	private WebElement linkedIn_Website_Salesforce_Logout_Button;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement linkedIn_Website_Salesforce_OK_Button;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	private WebElement linkedIn_Website_Salesforce_Cancel_Button;
	
	@FindBy(xpath = "//input[@id='phSearchInput']")
	private WebElement linkedIn_Website_Salesforce_Search_Text_Field;
	
	@FindBy(xpath = "//input[@id='phSearchButton']")
	private WebElement linkedIn_Website_Salesforce_Search_Button;
	
	@FindBy(xpath = "//th[contains(@class,'dataCell')]//following::a[contains(text(),'Adobe')]")
	private WebElement salesforce_Adobe_Company_Name;
	
	@FindBy(xpath = "//span[@class='ni-company']//a[text()='Adobe']")
	private WebElement salesforce_Rev_Driver_Adobe_Company_Name;
	
	@FindBy(xpath = "(//span[@class='global-nav__primary-link-text']//following::li-icon[@type='caret'])[1]")
	private WebElement linkedIn_Website_Me_Button;
	
	@FindBy(xpath = "//*[contains(text(),'Sign Out')]")
	private WebElement linkedIn_Website_Sign_Out_Button;
	
	@FindBy(xpath = "//input[@id='session_key']")
	private WebElement linkedIn_Website_User_Name_Input_Field;
	
	@FindBy(xpath = "//input[@id='session_password']")
	private WebElement linkedIn_Website_Password_Input_Field;
	
	@FindBy(xpath = "//button[@class='sign-in-form__submit-button']")
	private WebElement linkedIn_Website_Submit_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Work')]")
	private WebElement linkedIn_Website_Work_Button;
	
	@FindBy(xpath = "//span[@title='Sales Nav' and contains(text(),'Sales Nav')]")
	private WebElement linkedIn_Website_Sales_Nav_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Home')]")
	private WebElement Sales_Navigator_Home_Button;
	
	@FindBy(xpath = "//a[contains(text(),'Accounts')]")
	private WebElement Sales_Navigator_Accounts_Button;
	
	@FindBy(xpath = "//a[contains(text(),'Leads')]")
	private WebElement Sales_Navigator_Leads_Button;
	
	
	public List<WebElement> getContacts_Email_Select_All_List() {
		return contacts_Email_Select_All_List;
	}

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

	public WebElement getContacts_Name_LinkedIn_Link() {
		return contacts_Name_LinkedIn_Link;
	}

	public WebElement getLinkedIn_Email_Or_PhoneNumber_Text_Field() {
		return linkedIn_Email_Or_PhoneNumber_Text_Field;
	}

	public WebElement getLinkedIn_Password_Text_Field() {
		return linkedIn_Password_Text_Field;
	}

	public WebElement getLinkedIn_Agree_And_Join_Button() {
		return linkedIn_Agree_And_Join_Button;
	}

	public WebElement getLinkedIn_Sign_In_Link() {
		return linkedIn_Sign_In_Link;
	}

	public WebElement getLinkedIn_My_Network_Text() {
		return linkedIn_My_Network_Text;
	}

	public WebElement getContacts_Name_LinkedIn_Link_From_Sales_Intel_Site() {
		return contacts_Name_LinkedIn_Link_From_Sales_Intel_Site;
	}

	public WebElement getLinkedIn_Contact_Person_Details() {
		return linkedIn_Contact_Person_Details;
	}

	public WebElement getLinkedIn_Clear_Button() {
		return linkedIn_Clear_Button;
	}

	public WebElement getLinkedIn_Website_Search_Button() {
		return linkedIn_Website_Search_Button;
	}

	public WebElement getLinkedIn_Website_View_Button() {
		return linkedIn_Website_View_Button;
	}

	public WebElement getLinkedIn_Website_Visit_Website_Button() {
		return linkedIn_Website_Visit_Website_Button;
	}

	public WebElement getLinkedIn_Website_Adobe_Text() {
		return linkedIn_Website_Adobe_Text;
	}

	public WebElement getLinkedIn_Website_Adobe_First_Customer_Name() {
		return linkedIn_Website_Adobe_First_Customer_Name;
	}

	public WebElement getLinkedIn_Website_Select_All_Check_Box() {
		return linkedIn_Website_Select_All_Check_Box;
	}

	public WebElement getLinkedIn_Website_Export_Button() {
		return linkedIn_Website_Export_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Field() {
		return linkedIn_Website_Salesforce_Field;
	}

	public WebElement getLinkedIn_Website_Salesforce_Username_Field() {
		return linkedIn_Website_Salesforce_Username_Field;
	}

	public WebElement getLinkedIn_Website_Salesforce_Password_Field() {
		return linkedIn_Website_Salesforce_Password_Field;
	}

	public WebElement getLinkedIn_Website_Salesforce_Login_Button() {
		return linkedIn_Website_Salesforce_Login_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Already_Revealed_Details_Checkbox() {
		return linkedIn_Website_Salesforce_Already_Revealed_Details_Checkbox;
	}

	public WebElement getLinkedIn_Website_Salesforce_UrRevealed_Details_Checkbox() {
		return linkedIn_Website_Salesforce_UrRevealed_Details_Checkbox;
	}

	public WebElement getLinkedIn_Website_Salesforce_Export_Type_Label() {
		return linkedIn_Website_Salesforce_Export_Type_Label;
	}

	public WebElement getLinkedIn_Website_Salesforce_Export_as_Lead_Label() {
		return linkedIn_Website_Salesforce_Export_as_Lead_Label;
	}

	public WebElement getLinkedIn_Website_Salesforce_Export_as_Contact_Label() {
		return linkedIn_Website_Salesforce_Export_as_Contact_Label;
	}

	public WebElement getLinkedIn_Website_Salesforce_Next_Button() {
		return linkedIn_Website_Salesforce_Next_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Close_Button() {
		return linkedIn_Website_Salesforce_Close_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Home_Button() {
		return linkedIn_Website_Salesforce_Home_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Accounts_Button() {
		return linkedIn_Website_Salesforce_Accounts_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Contacts_Button() {
		return linkedIn_Website_Salesforce_Contacts_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Leads_Button() {
		return linkedIn_Website_Salesforce_Leads_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Drop_Down() {
		return linkedIn_Website_Salesforce_Drop_Down;
	}

	public WebElement getLinkedIn_Website_Salesforce_Cutomer_name() {
		return linkedIn_Website_Salesforce_Cutomer_name;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Home() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Home;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts_Button() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Contacts_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts_Button() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Accounts_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads_Button() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Leads_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Recently_Viewed_Contacts_Label() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_Recently_Viewed_Contacts_Label;
	}

	public List<WebElement> getLinkedIn_Website_Salesforce_Close_Icon() {
		return linkedIn_Website_Salesforce_Close_Icon;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_My_Accounts_Label() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_My_Accounts_Label;
	}

	public WebElement getLinkedIn_Website_Salesforce_Switch_to_Lightning_Experience_All_Open_Leads_Label() {
		return linkedIn_Website_Salesforce_Switch_to_Lightning_Experience_All_Open_Leads_Label;
	}

	public List<WebElement> getLinkedIn_Website_Salesforce_Second_Close_Icon() {
		return linkedIn_Website_Salesforce_Second_Close_Icon;
	}

	public WebElement getLinkedIn_Website_Salesforce_Remember_Me_Check_Box_Field() {
		return linkedIn_Website_Salesforce_Remember_Me_Check_Box_Field;
	}

	public List<WebElement> getLinkedIn_Website_Salesforce_Duplicate_Next_Button() {
		return linkedIn_Website_Salesforce_Duplicate_Next_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_List_Section() {
		return linkedIn_Website_Salesforce_List_Section;
	}

	public WebElement getLinkedIn_Website_Salesforce_App_Message_Filters() {
		return linkedIn_Website_Salesforce_App_Message_Filters;
	}

	public WebElement getLinkedIn_Website_Settings_Menu() {
		return linkedIn_Website_Settings_Menu;
	}

	public WebElement getLinkedIn_Website_Salesforce_Settings_Menu() {
		return linkedIn_Website_Salesforce_Settings_Menu;
	}

	public WebElement getLinkedIn_Website_Salesforce_Logout_Button() {
		return linkedIn_Website_Salesforce_Logout_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_OK_Button() {
		return linkedIn_Website_Salesforce_OK_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Cancel_Button() {
		return linkedIn_Website_Salesforce_Cancel_Button;
	}

	public WebElement getLinkedIn_Website_Salesforce_Search_Text_Field() {
		return linkedIn_Website_Salesforce_Search_Text_Field;
	}

	public WebElement getLinkedIn_Website_Salesforce_Search_Button() {
		return linkedIn_Website_Salesforce_Search_Button;
	}

	public WebElement getSalesforce_Adobe_Company_Name() {
		return salesforce_Adobe_Company_Name;
	}

	public WebElement getSalesforce_Rev_Driver_Adobe_Company_Name() {
		return salesforce_Rev_Driver_Adobe_Company_Name;
	}

	public WebElement getLinkedIn_Website_Me_Button() {
		return linkedIn_Website_Me_Button;
	}

	public WebElement getLinkedIn_Website_Sign_Out_Button() {
		return linkedIn_Website_Sign_Out_Button;
	}

	public WebElement getLinkedIn_Website_User_Name_Input_Field() {
		return linkedIn_Website_User_Name_Input_Field;
	}

	public WebElement getLinkedIn_Website_Password_Input_Field() {
		return linkedIn_Website_Password_Input_Field;
	}

	public WebElement getLinkedIn_Website_Submit_Button() {
		return linkedIn_Website_Submit_Button;
	}

	public WebElement getLinkedIn_Website_Work_Button() {
		return linkedIn_Website_Work_Button;
	}

	public WebElement getLinkedIn_Website_Sales_Nav_Button() {
		return linkedIn_Website_Sales_Nav_Button;
	}

	public WebElement getSales_Navigator_Home_Button() {
		return Sales_Navigator_Home_Button;
	}

	public WebElement getSales_Navigator_Accounts_Button() {
		return Sales_Navigator_Accounts_Button;
	}

	public WebElement getSales_Navigator_Leads_Button() {
		return Sales_Navigator_Leads_Button;
	}

	public WebElement getLinkedIn_Website_Integrations_Settings_Menu() {
		return linkedIn_Website_Integrations_Settings_Menu;
	}

}
