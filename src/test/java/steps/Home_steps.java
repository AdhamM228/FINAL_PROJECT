package steps;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Home_page;

public class Home_steps {
    Hooks x = new Hooks();


    @BeforeTest
    public void openbrowser() {
        x.openBrowser();
    }

    @Test

    public void Test() throws InterruptedException {
        Home_page Home = new Home_page();
//Scenario 1:
        //Click on Signup button
        Home.signupButton().click();
        //Enter username
        Home.usernamefield_signup().sendKeys("Adham Mohamed1326");
        //Enter passowrd
        Home.passwordfield_signup().sendKeys("A2282003");
        //Click on Sign up button
        Home.Sign_upButton().click();
        Thread.sleep(5000);
        //Click on ok button
        Hooks.driver.switchTo().alert().accept();

//Scenario 2:
            //Click on Login button
            Home.LoginButton().click();
            //Enter username
            Home.Usernamefield_login().sendKeys("Adham Mohamed1326");
            //Enter passowrd
            Home.Passwordfield_login().sendKeys("A2282003");
            //Click on Login_button
            Home.Login_Button().click();
            Thread.sleep(4000);
            //Click on laptops button
            Home.laptops_button().click();
            //choose laptop
        Home.choose_laptop().click();
        //Click on Add to cart
        Home.Add_to_cart_button().click();
        Thread.sleep(2000);
        //Click on ok button
        Hooks.driver.switchTo().alert().accept();
        //Click on Home button
        Home.Home_button().click();
        Thread.sleep(2000);
        //choose phone
        Home.choose_phone().click();
        //Click on Add to cart2
        Home.Add_to_cart_button2().click();
        Thread.sleep(2000);
        //Click on ok button
        Hooks.driver.switchTo().alert().accept();
        //Click on cart button
        Home.Cart_button().click();
        Thread.sleep(5000);
        //Click on Place order Button
        Home.Place_order_Button().click();
        //Enter Name
        Home.Namefield().sendKeys("Adham Mohamed");
        //Enter Country
        Home.Countryfield().sendKeys("Egypt");
        //Enter City
        Home.Cityfield().sendKeys("10 Of Ramdan");
        //Enter Credit card
        Home.Credit_cardfield().sendKeys("5478432109453283");
        //Enter Month
        Home.Monthfield().sendKeys("10");
        //Enter Year
        Home.Yearfield().sendKeys("2025");
        //Click on Purchase_Button
        Home.Purchase_Button().click();
        Thread.sleep(5000);
        //Click on OK
        Home.OK_Button().click();
        }


    @AfterTest
    public void closebrowser() throws InterruptedException {
        x.quit();
    }





//cucumber

    //Scenario1
    @Given("Click on Signup button")
    public void clickOnSignupButton() throws InterruptedException {
        Home.signupButton().click();
    }
    Home_page Home = new Home_page();

    @When("Enter_Username")
    public void enterUsername() throws InterruptedException {
        Home.usernamefield_signup().sendKeys("Adham Mohamed0990");
    }

    @When("Enter passowrd")
    public void enterPassowrd() throws InterruptedException {
        Home.passwordfield_signup().sendKeys("A2282003");
    }

    @When("Click on Sign up button")
    public void clickOnSignUpButton() throws InterruptedException {
        Home.Sign_upButton().click();
        Thread.sleep(5000);
    }

    @Then("Click on ok button")
    public void clickOnOkButton() throws InterruptedException {
        Hooks.driver.switchTo().alert().accept();
        Thread.sleep(4000);
    }



    //Scenario2
    @Given("Click_on_Login_Button")
    public void click_on_Login_Button() throws InterruptedException {
        Home_page Home = new Home_page();
        Home.LoginButton().click();
    }

    @When("Enter username")
    public void Enter_username() throws InterruptedException {
        Home.Usernamefield_login().sendKeys("Adham Mohamed1324");
    }

    @When("Enter password")
    public void Enter_password() throws InterruptedException {
        Home.Passwordfield_login().sendKeys("A2282003");
    }

    @When("click on Login button")
    public void Click_on_Login_button() throws InterruptedException {
        Home.Login_Button().click();
        Thread.sleep(4000);
    }

    @When("Click on laptops button")
    public void Click_on_laptops_button() throws InterruptedException {
        Home.laptops_button().click();
    }

    @When("choose laptop")
    public void choose_laptop() throws InterruptedException {
        Home.choose_laptop().click();
    }

    @When("Click_on_Add_to_cart")
    public void Click_on_Add_to_cart() throws InterruptedException {
        Home.Add_to_cart_button().click();
        Thread.sleep(2000);
    }

    @When("Click_on_ok_button")
    public void Click_on_ok_button() throws InterruptedException {
        Hooks.driver.switchTo().alert().accept();
    }

    @When("Click_on_cart_button")
    public void Click_on_cart_button() throws InterruptedException {
        Home.Cart_button().click();
        Thread.sleep(5000);
    }

    @When("Click_on_Place_order_Button")
    public void Click_on_Place_order_Button() throws InterruptedException {
        Home.Place_order_Button().click();
    }

    @When("Enter_Name")
    public void Enter_Name() throws InterruptedException {
        Home.Namefield().sendKeys("Adham Mohamed");
    }

    @When("Enter_Country")
    public void Enter_Country() throws InterruptedException {
        Home.Countryfield().sendKeys("Egypt");
    }

    @When("Enter_City")
    public void Enter_City() throws InterruptedException {
        Home.Cityfield().sendKeys("10 Of Ramdan");
    }

    @When("Enter_Credit_card")
    public void Enter_Credit_card() throws InterruptedException {
        Home.Credit_cardfield().sendKeys("5478432109453283");
    }

    @When("Enter_Month")
    public void Enter_Month() throws InterruptedException {
        Home.Monthfield().sendKeys("10");
    }

    @When("Enter_Year")
    public void Enter_Year() throws InterruptedException {
        Home.Yearfield().sendKeys("2024");
    }

    @When("Click_on_Purchase_Button")
    public void Click_on_Purchase_Button()throws InterruptedException {
        Home.Purchase_Button().click();
        Thread.sleep(5000);
    }

    @Then("Click_on_OK")
    public void Click_on_OK() throws InterruptedException {
        Home.OK_Button().click();
}



    //Scenario3
    @Given("clickonloginbutton")
    public void clickonloginbutton() throws InterruptedException {
        Home_page Home = new Home_page();
        Home.LoginButton().click();
    }

    @When("Enter USERNAME")
    public void Enter_USERNAME() throws InterruptedException {
        Home.Usernamefield_login().sendKeys("Adham Mohamed1324");
    }

    @When("Enter PassworD")
    public void Enter_PassworD() throws InterruptedException {
        Home.Passwordfield_login().sendKeys("A2282003");
    }

    @When("CLICK On Login Button")
    public void CLICK_On_Login_Button() throws InterruptedException {
        Home.Login_Button().click();
        Thread.sleep(4000);
    }

    @When("CLICK On Laptops Button")
    public void CLICK_On_Laptops_Button() throws InterruptedException {
        Home.laptops_button().click();
    }

    @When("Choose LaptoP")
    public void Choose_LaptoP() throws InterruptedException {
        Home.choose_laptop().click();
    }

    @When("CLICK_On_Add_To_Cart")
    public void CLICK_On_Add_To_Cart() throws InterruptedException {
        Home.Add_to_cart_button().click();
        Thread.sleep(4000);
    }


    @When("CLICK_On_ok_button")
    public void CLICK_On_ok_button() throws InterruptedException {
        Hooks.driver.switchTo().alert().accept();
        Thread.sleep(4000);
    }

    @When("CLiCK on Add To Cart")
    public void CLICKOnAddToCart() throws InterruptedException {
        Home.Add_to_cart_button().click();
        Thread.sleep(2000);
    }

    @When("CLiCK on Ok button")
    public void CLiCKonOkbutton() throws InterruptedException {
        Hooks.driver.switchTo().alert().accept();
        Thread.sleep(4000);
    }

    @Then("Click_on_Cart_Button")
    public void Click_on_Cart_Button() throws InterruptedException {
        Home.Cart_button().click();
        Thread.sleep(5000);
    }



    //Scenario4
    @Given("Click_on_LOGIN_Button")
    public void click_on_LOGIN_Button() throws InterruptedException {
        Home_page Home = new Home_page();
        Home.LoginButton().click();
    }

    @When("Enter UsernamE")
    public void Enter_UsernamE() throws InterruptedException {
        Home.Usernamefield_login().sendKeys("ADJK23");
    }

    @When("Enter PasswoRd")
    public void Enter_PasswoRd() throws InterruptedException {
        Home.Passwordfield_login().sendKeys("AFFLSR3");
    }

    @Then("cLicK_On_Login_button")
    public void cLicK_On_Login_button() throws InterruptedException {
        Home.Login_Button().click();
        Thread.sleep(4000);
    }
}
