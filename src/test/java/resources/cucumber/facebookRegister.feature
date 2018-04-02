Feature: Register FaceBook Account

  Background:
    Given the facebook page is open "https://www.facebook.com/"

  @dataTable
  Scenario Outline: Register one facebook Account
    Given I want to set my login in firstName as <firstName>
    Given I want to set my login in secondName as <secondName>
    When I want to set my register mobile number as <mobileNumber>
    Then Set a register pass word as <passWord>
    Then Set a register male as <male>

    Examples:
      | firstName | secondName | mobileNumber | passWord   | male |
      | "zhang"   | "xinyu"    | "18909204520"  | "xinyu001"   | "0"    |
#      | "zhang"   | "xinyuan"  | "18909204521"  | "xinyuan001" | "0"    |