 Feature: Validate application Exported contact displayed in Salesforce Website with US Region
 
  @Validated_Salesforce_And_LinkedIn_Website
  Scenario: To validate application Exported contact displayed in Salesforce Website with US Region
  When Switch To Salesforce Website
  And Click on Leads Button in Salesforce Website Using US Region
  And Click on Close Icon, If appears in Salesforce Website Using US Region
  And Enter the Exported data in search box in Salesforce Website Using US Region
  Then Validated the Exported data in Salesforce Website Using US Region
  When Click on Chrome Extensions
  And Click on Salesforce Updated RevDriver by SalesIntel
  And Switch To Frame with US Region For LinkedIn
  #And Click on Filter option with US Region For LinkedIn
  #And Click on Contacts Name Button with US Region For LinkedIn
  #And Enter the Firstname as Exported First Name with US Region For LinkedIn
  #And Enter the Lastname as Exported Last Name with US Region For LinkedIn
  #And Click on Search Button for Exported Name in Salesforce Website Using US Region
  Then Validate the Exported contact displayed in Salesforce Website