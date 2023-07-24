Feature: purchase the flight submit the form.

  Scenario Outline: Verify the submit form functioanlity
    Given User get purchase page "https://blazedemo.com/purchase.php"
    When User enters Name "<firstLast>"
    And User enters address "<Address>"
    And User enters City "<City>"
    And User enters State "<State>"
    And User enters Zip Code "<ZipCode>"
    And User selects Card Type "<CardType>"
    And User enters Credit Card Number "<CardNumber>"
    And User enters Month "<Month>"
    And User enters Year "<Year>"
    And User enters Name on Card "<NameOnCard>"
    And User clicks remember me box
    And User clicks Submit button
    Then User verifies confirmation message "<confirmationText>"

    Examples: 
      | firstLast  | Address  | City       | State | ZipCode | CardType         | CardNumber | Month | Year | NameOnCard | confirmationText                   |
      | John Cena  | 123 st   | San diego  | CA    |   12345 | Visa             |  123456789 |    06 | 2023 | John Cena  | Thank you for your purchase today! |
      | Jane Doe   | 436 rd   | Los Ageles | Az    |   45678 | American Express |  987654321 |    04 | 2025 | Jane Doe   | Thank you for your purchase today! |
      | Bob Marley | 784 ln   | Temecula   | TX    |   74125 | Diner's Club     |  741258963 |    12 | 2029 | Bob Marley | Thank you for your purchase today! |
      | John Smith | 987 blvd | Irvine     | FL    |   56705 | American Express |  369852147 |    09 | 2027 | John Smith | Thank you for your purchase today! |
      | Matt Nixon | 742 st   | San Marcos | GA    |   52364 | Visa             |  753159456 |    01 | 2024 | Matt Nixon | Thank you for your purchase today! |
