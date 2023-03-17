 Feature: Validate application Salesforce Leads Page with US Region
 
  @Validated_Salesforce_And_LinkedIn_Website
  Scenario: To validate application Salesforce Leads Page with US Region
  When Click on Leads Button in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Leads page in Salesforce Website Using US Region
  When Switch From Frame To Webpage in Salesforce Website Using US Region
  And Click on Leads Page-All Open Leads Dropdown in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validate the customer name from Leads page-All Open Leads Dropdown in Salesforce Website Using US Region
