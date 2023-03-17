 Feature: Validate application details in LinkedIn website and Salesforce website using US Region
 
 @Validated_Salesforce_And_LinkedIn_Website
  Scenario: To validate application contact's Name in LinkedIn website using US Region
  Given Launch the url with US Region For LinkedIn
  When Click on Chrome Extensions
  And Click on Pin From Chrome Extensions
  And Click on RevDriver by SalesIntel
  #And Switch To Child Window
  And Switch To Frame with US Region For LinkedIn
  And Enter the UserName with US Region For LinkedIn
  And Enter the Password with US Region For LinkedIn
  And Click on Login CTA with US Region For LinkedIn
  And Click on Filter option with US Region For LinkedIn
  And Click on Contacts Name Button with US Region For LinkedIn
  And Enter the Firstname with US Region For LinkedIn
  And Enter the Lastname with US Region For LinkedIn
  And Click on Search Button with US Region For LinkedIn
  And Click On LinkedIn Link Contact with US Region
  And Switch To LinkedIn Website
  And Click On Sign In Link In LinkedIn Website
  And Enter the Email Address In LinkedIn Website
  And Enter the Password In LinkedIn Website
  And Click on Agree&Join Button
  Then I Close the current window
  And Switch To LinkedIn Website To SalesIntel Website
  Then I Wait short period for Page Load
  And Switch To Frame with US Region For LinkedIn
  And Click On LinkedIn Link Contact with US Region In SalesIntel Website
  And Switch To LinkedIn Website To Specific Contact Details
  Then I Wait Till My Network text to be displayed
  When Click on Chrome Extensions
  And Click on Updated RevDriver by SalesIntel 
  Then I Wait Till Specific Contact Details to be displayed
  Then I Validated Contact Details from Sales Intel Site and LinkedIn Site
  Then I Close the current window
  And Switch To LinkedIn Website To SalesIntel Website
  #And Close the Browser with US Region For LinkedIn
  
  