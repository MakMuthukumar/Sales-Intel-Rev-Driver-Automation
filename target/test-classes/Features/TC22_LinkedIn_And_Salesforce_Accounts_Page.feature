 Feature: Validate application Salesforce Accounts Page with US Region
 
  @Validated_Salesforce_And_LinkedIn_Website
  Scenario: To validate application Salesforce Accounts Page with US Region
  When Click on Account Button in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Account page in Salesforce Website Using US Region
  When Switch From Frame To Webpage in Salesforce Website Using US Region
  And Click on Account Page-My Accounts Dropdown in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Account page-My Accounts Dropdown in Salesforce Website Using US Region
  When Switch From Frame To Webpage in Salesforce Website Using US Region