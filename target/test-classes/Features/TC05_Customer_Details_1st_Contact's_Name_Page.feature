Feature: Validate application Customer Details-Contact's Name Functionality

  @Customer_Details
  Scenario: To validate application 1st Contact's Name
  When Click on Filter Button
  And Click on Contacts Email Button
  And Enter the Firstname
  And Enter the Lastname
  And Click on Search Button
  And Click on Reveal Button
  And Click on Cancel Button
  And Wait Till Page Load To Display Select All Data 