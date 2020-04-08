@Selenium
Feature: Creation of Material Hierarchy

  Scenario Outline: User creates New material for a product
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Click Libraries tab under specification
    When User create New material with mandatory deatails for material creation "<Standalone-value>","<Standalone-material>","<Standalone-code>"
    And User create material for Structure Component "<StrComponent-value>","<StrComponent-material>","<StrComponent-code>","<Tool-value>","<Tool-material>","<Tool-code>"
    And User performing copy and delete action on material
    And User creates color and size
    #Then select the image from the avilable resource

    Examples: 
      | Standalone-value    | Standalone-material | Standalone-code  | StrComponent-value           | StrComponent-material | StrComponent-code | Tool-value    | Tool-material | Tool-code        |
      | Fabric - Stanadlone | cotton              | 123 - Automation | Fabric - Structure Component | shoe structure        | 123 - Automation  | Fabric - Tool | Hand bad Tool | 123 - Automation |
