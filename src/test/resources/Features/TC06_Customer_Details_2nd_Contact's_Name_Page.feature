Feature: Validate application Customer Details-Contact's Name Functionality

  @Customer_Details
  Scenario: To validate application 2nd Contact's Name
  When Click on Filter Button
  And Click on Contacts Email Button
  And Enter the 2nd Contacts Firstname
  And Enter the 2nd Contacts Lastname
  And Click on Search Button
  And Click on Reveal Button
  And Click on Cancel Button
  And Wait Till Page Load To Display Select All Data 