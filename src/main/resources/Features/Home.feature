@smoke
Feature: Home
  Scenario: signing up with an existing username
    Given Click on Signup button
    When Enter_Username
    When Enter passowrd
    When Click on Sign up button
    Then Click on ok button



  Scenario: Attempt to purchase with an expired credit card
    Given Click_on_Login_Button
    When Enter username
    When Enter password
    When click on Login button
    When Click on laptops button
    When choose laptop
    When Click_on_Add_to_cart
    When Click_on_ok_button
    When Click_on_cart_button
    When Click_on_Place_order_Button
    When Enter_Name
    When Enter_Country
    When Enter_City
    When Enter_Credit_card
    When Enter_Month
    When Enter_Year
    When Click_on_Purchase_Button
    Then Click_on_OK

    Scenario: Try adding the same product twice to the cart and verify that the quantity updates correctly
      Given clickonloginbutton
      When Enter USERNAME
      When Enter PassworD
      When CLICK On Login Button
      When CLICK On Laptops Button
      When Choose LaptoP
      When CLICK_On_Add_To_Cart
      When CLICK_On_ok_button
      When CLiCK on Add To Cart
      When CLiCK on Ok button
      Then Click_on_Cart_Button

    Scenario:Attempt to log in with incorrect credentials
      Given Click_on_LOGIN_Button
      When Enter UsernamE
      When Enter PasswoRd
      Then cLicK_On_Login_button
