Feature: Validate application Customer Details-Job Department Functionality

  @Customer_Details
  Scenario: To validate application Job Department functionality
  Then I Wait for Page Load
  When Click on Filter Button
  And Click on Job Department Button
  And Select All Checkbox Option in Job Department
  And Click on Search Button
  And Click on Cancel Button
   #And UnSelect All Checkbox Option in Job Department
   #And Click on Job Department Button
