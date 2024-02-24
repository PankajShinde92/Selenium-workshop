Feature: Register New User in Para Bank

  Scenario Outline: Register New User
    Given open website of Para Bank
    When Click on Register
    Then enter "<FirstName>" "<LastName>" "<address>" "<city>" "<state>" "<zipcode>" "<phonenumber>" "<SSN>"
    And "<Username>" "<password>"
    Then click Register "<password>"

    Examples:
      | FirstName | LastName | address           | city      | state | zipcode | phonenumber | SSN         | Username | password |
      | Joe       | Whale    |  George Street    | Sydney    | NSW   | 2000    | 0423768356  | 1534353426  | JoWhlae  | abc@123  |
      | Jamie     | Para     |  Melbourne Street | Brisbane  | QLD   | 4000    | 0403976589  | 5467353426  | JaPara   | abc@123  |
      | Edmund    | Herald   |  Sydney Street    | Hobart    | TAS   | 5000    | 0419638250  | 4653353426  | EdHerald | abc@123  |
      | Sam       | Bing     |  Brisbane Street  | Melbourne | VIC   | 3000    | 0406398800  | 2098353426  | Sabing   | abc@123  |