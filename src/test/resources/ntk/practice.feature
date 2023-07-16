Feature: purchase the flight submit the form.

  Scenario Outline: Verify the submit form functioanlity
    Given User get purchase page "https://blazedemo.com/purchase.php"
    When User enters Name | enterValue "firstLastNameField" "<firstLast>"
    And User enters address| enterValue  "addressField" "<Address>"
    And User enters City | enterValue "cityField" "<City>"
    And User enters State | enterValue "stateField" "<State>"
    And User enters Zip Code | enterValue "zipCodeField" "<ZipCode>"
    And User selects Card Type | selectsValue "selectCardType" "<CardType>"
    And User enters Credit Card Number | enterValue "creditCardNumField" "<CardNumber>"
    And User enters Month | enterValue "monthField" "<Month>"
    And User enters Year | enterValue "yearField" "<Year>"
    And User enters Name on Card | enterValue "nameOnCardField" "<NameOnCard>"
    And User clicks remember me box | click "rememberMeButton" "remember me box"
    And User clicks Submit button | click "purchaseFlightButton" "submit"
    Then User verifies confirmation message | verifiesValue "confirmationText" "<confirmationText>"

    Examples: 
      | firstLast  | Address  | City       | State | ZipCode | CardType         | CardNumber | Month | Year | NameOnCard | confirmationText                   |
      | John Cena  | 123 st   | San diego  | CA    |   12345 | Visa             |  123456789 |    06 | 2023 | John Cena  | Thank you for your purchase today! |
      | Jane Doe   | 456 rd   | Los Ageles | Az    |   45678 | American Express |  987654321 |    04 | 2025 | Jane Doe   | Thank you for your purchase today! |
      | Bob Marley | 789 ln   | Temecula   | TX    |   74125 | Diner's Club     |  741258963 |    12 | 2029 | Bob Marley | Thank you for your purchase today! |
      | Sam Smith  | 987 blvd | Irvine     | FL    |   01236 | American Express |  369852147 |    09 | 2027 | Sam Smith  | Thank you for your purchase today! |
      | Matt Nixon | 741 st   | San Marcos | GA    |   52364 | Visa             |  753159456 |    01 | 2024 | Matt Nixon | Thank you for your purchase today! |
