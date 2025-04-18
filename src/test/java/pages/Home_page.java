package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.Hooks;

public class Home_page {
    public WebDriver driver= Hooks.driver;
//Scenario 1:
    public WebElement signupButton() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@id=\"signin2\"]"));
    }
    public WebElement usernamefield_signup() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"sign-username\"]"));
    }
    public WebElement passwordfield_signup() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"sign-password\"]"));
    }
    public WebElement Sign_upButton() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@onclick=\"register()\"]"));
    }
//Scenario 2:
        public WebElement LoginButton() throws InterruptedException {
            Thread.sleep(2000);
            return driver.findElement(By.xpath("//a[@id=\"login2\"]"));
        }
        public WebElement Usernamefield_login() throws InterruptedException {
            Thread.sleep(2000);
            return driver.findElement(By.xpath("//input[@id=\"loginusername\"]"));
        }
        public WebElement Passwordfield_login() throws InterruptedException {
            Thread.sleep(2000);
            return driver.findElement(By.xpath("//input[@id=\"loginpassword\"]"));
        }
        public WebElement Login_Button() throws InterruptedException {
            Thread.sleep(2000);
            return driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]"));
        }
        public WebElement laptops_button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@onclick=\"byCat('notebook')\"]"));
        }
    public WebElement choose_laptop() throws InterruptedException {
        Thread.sleep(4000);
        return driver.findElement(By.xpath("//a[@href=\"prod.html?idp_=15\"]"));
    }
    public WebElement Add_to_cart_button() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath("//a[@onclick=\"addToCart(15)\"]"));
    }
    public WebElement Home_button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@href=\"index.html\"]"));
    }
    public WebElement choose_phone() throws InterruptedException {
        Thread.sleep(4000);
        return driver.findElement(By.xpath("//a[@href=\"prod.html?idp_=1\"]"));
    }
    public WebElement Add_to_cart_button2() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath("//a[@onclick=\"addToCart(1)\"]"));
    }
    public WebElement Cart_button() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath("//a[@id=\"cartur\"]"));
    }
    public WebElement Place_order_Button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@data-target=\"#orderModal\"]"));
    }
    public WebElement Namefield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"name\"]"));
    }
    public WebElement Countryfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"country\"]"));
    }
    public WebElement Cityfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"city\"]"));
    }
    public WebElement Credit_cardfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"card\"]"));
    }
    public WebElement Monthfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"month\"]"));
    }
    public WebElement Yearfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"year\"]"));
    }
    public WebElement Purchase_Button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@onclick=\"purchaseOrder()\"]"));
    }
    public WebElement OK_Button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@class=\"confirm btn btn-lg btn-primary\"]"));
    }
}