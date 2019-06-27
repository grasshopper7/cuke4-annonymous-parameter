Feature: Parameter Conversion for Cucumber-JVM 4

  Scenario: Parameter scenario class and enum
    Given Customer John orders COFFEE
    Given Customer Jane orders LEMONADE
    
  Scenario: Parameter scenario Date
    Given the date value is 2010-10-15

  Scenario: Parameter scenario BigInteger
    Given the biginteger value is 7777777777

  Scenario: Parameter scenario BigDecimal
    Given the bigdecimal value is 77777.77777