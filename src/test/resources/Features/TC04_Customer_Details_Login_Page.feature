Feature: Validate application Customer Details-login page

	@Customer_Details
  Scenario: To validate application login page
  Given Launch the url
  When Click on Chrome Extensions
  And Click on Pin From Chrome Extensions
  And Click on RevDriver by SalesIntel
  #And Switch To Child Window
  And Switch To Frame
  And Enter the UserName
  And Enter the Password
  And Click on Login CTA
   