 Feature: Validate application Company Details as Adobe in LinkedIn website and Salesforce website using US Region
 
  @Validated_Salesforce_And_LinkedIn_Website
  Scenario: To validate application Company Details as Adobe in LinkedIn website using US Region
  Then I Wait short period for Page Load
  And Switch To Frame with US Region For LinkedIn
  When Click on Filter option with US Region For LinkedIn
  And Click On Clear Button with US Region For LinkedIn 
  And Enter the Firstname with US Region For LinkedIn
  And Enter the Lastname with US Region For LinkedIn
  And Click on Search Button with US Region For LinkedIn
  And Click On LinkedIn Link Contact with US Region
  And Switch To LinkedIn Website
  And Enter the Company name as Adobe in Search Field
  And Click On View Page with US Region In SalesIntel Website
  When Click on Chrome Extensions
  And Click on Adobe Updated RevDriver by SalesIntel
  And Switch To Frame with US Region For LinkedIn
  Then Validate Adobe Text For US Region In SalesIntel Website
  And Get the name From SalesIntel Website In US Region