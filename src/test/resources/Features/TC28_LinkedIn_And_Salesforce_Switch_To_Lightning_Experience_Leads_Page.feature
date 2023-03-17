 Feature: Validate application Salesforce Switch to Lightning Experience-Leads Page with US Region
 
  @Validated_Salesforce_And_LinkedIn_Website
  Scenario: To validate application Salesforce Switch to Lightning Experience-Leads Page with US Region
  When Switch From Frame To Webpage in Salesforce Website Using US Region
  When Click on Switch to Lightning Experience-Leads label in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Leads page in Salesforce Website Using US Region
  When Switch From Frame To Webpage in Salesforce Website Using US Region
  And Click on Switch to Lightning Experience-All Open Leads label in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Leads page-All Open Leads in Salesforce Website Using US Region
