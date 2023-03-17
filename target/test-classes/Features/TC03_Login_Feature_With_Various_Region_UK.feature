Feature: Validate application login Page with UK Region functionality
 
  @Various_Region_UK
  Scenario: To validate application login page with UK Region
  Given Launch the url with UK Region
  When Click on Chrome Extensions
  And Click on Pin From Chrome Extensions
  And Click on RevDriver by SalesIntel
  #And Switch To Child Window
  And Switch To Frame with UK Region
  And Enter the UserName with UK Region
  And Enter the Password with UK Region
  And Click on Login CTA with UK Region
  And Close the Browser with UK Region