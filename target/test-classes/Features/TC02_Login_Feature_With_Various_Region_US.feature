Feature: Validate application login Page with US Region functionality

 	@Various_Region_US
  Scenario: To validate application login page with US Region
  Given Launch the url with US Region
  When Click on Chrome Extensions
  And Click on Pin From Chrome Extensions
  And Click on RevDriver by SalesIntel
  #And Switch To Child Window
  And Switch To Frame with US Region
  And Enter the UserName with US Region
  And Enter the Password with US Region
  And Click on Login CTA with US Region
  And Close the Browser with US Region