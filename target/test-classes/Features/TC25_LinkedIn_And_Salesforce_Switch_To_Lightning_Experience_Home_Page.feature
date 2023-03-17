 Feature: Validate application Salesforce Switch to Lightning Experience-HomePage with US Region
 
  @Validated_Salesforce_And_LinkedIn_Website
  Scenario: To validate application Salesforce Switch to Lightning Experience-HomePage with US Region
 	When Switch From Frame To Webpage in Salesforce Website Using US Region
  And Click on Switch to Lightning Experience Label in Salesforce Website Using US Region
  And Click on Switch to Lightning Experience-Home label in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Home page in Salesforce Website Using US Region
  