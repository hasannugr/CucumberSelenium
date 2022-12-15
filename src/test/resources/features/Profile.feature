Feature: Profile Tests

  Background:
    Given User should be on the login page

  Scenario: User should be able to edit profile
    When User should input login information
    And User should go to My Profile
    And User should navigate to "Edit Profile"
    And User should input the information boxes
    Then User should verify the profile updated message


  Scenario: User should be able to see profile options
    When User should input "hasann.huseyinugr@gmail.com" and "14533541"
    Then User should see the profile options
      | Components |
      | Forms      |
      | JavaScript |
      | My Profile |


  Scenario: Login as a given user
    Then User should input following credentials

      | email    | hasann.huseyinugr@gmail.com |
      | password | 14533541                    |
      | Name     | Hasan Hüseyin               |


