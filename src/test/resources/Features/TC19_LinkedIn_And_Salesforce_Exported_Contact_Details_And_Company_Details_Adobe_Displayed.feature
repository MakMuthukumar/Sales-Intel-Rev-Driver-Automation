 Feature: Validate application Exported contact along with company details-Adobe displayed in Salesforce Website with US Region
 
 	@Validated_Salesforce_And_LinkedIn_Website
  Scenario: To validate application Exported contact along with company details-Adobe displayed in Salesforce Website with US Region
  When Switch From Frame To Webpage in Salesforce Website Using US Region
  Then Validated the Company details in Salesforce Website Using US Region
  And Switch To Frame with US Region For LinkedIn
  Then Validated the Company details in Salesforce Rev Driver Using US Region