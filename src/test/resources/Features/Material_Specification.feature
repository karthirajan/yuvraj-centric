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
   # Then select the image from the avilable resource
    Then Go to homepage
    And User creating suppliers,samples and sku and validates "<material-Sample>","<colors/sizes>","<SKU>"
    Then Go to homepage
    And User validates material gallery "<Test>","<MG-Filter>"
    And User validates material security group "<Test>","<MSG-Standalone>","<MSG-All>"
    And User validates colored material
    And User validates and edit material samples "<material-Sample>"
    And User validates material SKU's
    And User validates sourcing
    And User validates care label "<CL-Wash>","<CL-Iron>","<CL-Special>"
    And User validates composition placements "<CompPlacement-A>","<CompPlacement-B>"
    And User validates composition material "<compMaterial-A>","<compMaterial-B>","<compMaterial-C>"
    And User validates placement "<Placement-A>","<Placement-B>"
    And User validates product symbols "<PS-Brand>","<PS-Feature>","<PS-Function>"
    And User validates language "<Language-A>","<Language-B>","<Language-C>"
    And User validates product structure "<StrComponent-material>"

    Examples: 
      | CL-Wash   | CL-Iron   | CL-Special   | CompPlacement-A    | CompPlacement-B   | compMaterial-A | compMaterial-B | compMaterial-C | Placement-A          | Placement-B      | PS-Brand   | PS-Feature   | PS-Function   | Language-A | Language-B | Language-C | MSG-Standalone | MSG-All | Test          | MG-Filter | material-Sample | colors/sizes       | SKU          | Standalone-value    | Standalone-material | Standalone-code  | StrComponent-value           | StrComponent-material | StrComponent-code | Tool-value    | Tool-material | Tool-code        |
      | CL - Wash | CL - Iron | CL - Special | cotton - placement | linen - placement | cotton         | linen          | polyster       | shoulder - placement | Neck - placement | PS - Brand | PS - Feature | PS - Function | English    | French     | Japanese   | MSG-Standalone | MSG-All | QA Automation | Active    | cotton sample   | colors and sizes=1 | Material SKU | Fabric - Stanadlone | cotton              | 123 - Automation | Fabric - Structure Component | shoe structure        | 123 - Automation  | Fabric - Tool | Hand bad Tool | 123 - Automation |
