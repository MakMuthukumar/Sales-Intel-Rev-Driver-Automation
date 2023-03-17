 Feature: Validate application Salesforce Switch to Lightning Experience-Contacts Page with US Region
 
  @Validated_Salesforce_And_LinkedIn_Website
  Scenario: To validate application Salesforce Switch to Lightning Experience-Contacts Page with US Region
  When Switch From Frame To Webpage in Salesforce Website Using US Region
  When Click on Switch to Lightning Experience-Contacts label in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Contacts page in Salesforce Website Using US Region
  When Switch From Frame To Webpage in Salesforce Website Using US Region
  And Click on Switch to Lightning Experience-Recently Viewed Contacts label in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Contacts page-Recently Viewed Contacts in Salesforce Website Using US Region
