 Feature: Validate application Salesforce Contacts Page with US Region
 
  @Validated_Salesforce_And_LinkedIn_Website
  Scenario: To validate application Salesforce Contacts Page with US Region
  When Click on Contacts Button in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Contacts page in Salesforce Website Using US Region
  When Switch From Frame To Webpage in Salesforce Website Using US Region
  And Click on Contacts Page-My Accounts Dropdown in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Contacts page-Recently Viewed Contacts Dropdown in Salesforce Website Using US Region
  When Switch From Frame To Webpage in Salesforce Website Using US Region
 
 