package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Cucumber.class)
public class paraBankStepdefs {
    WebDriver driver = new ChromeDriver();


    @Given("open website of Para Bank")
    public void open_website_of_para_bank() throws InterruptedException {
        //Create a Selenium WebDriver instance
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        //Configure the Web browser
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Navigate to the web URL
        driver.get("https://www.guru99.com/gecko-marionette-driver-selenium.html");
        Thread.sleep(1000);
//        String title = driver.getTitle();
        //Assert and match the value.
        // assertThat(title.contains("Whale"));
    }

    @When("Click on Register")
    public void click_on_register() throws InterruptedException {
        WebElement register = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a"));
        Thread.sleep(2000);
        register.click();
    }

    @Then("enter {string} {string} {string} {string} {string} {string} {string} {string}")
    public void enter_joe_whale_george_street_sydney_nsw(String FirstName, String LastName, String Address, String City, String State, String Zipcode, String PhoneNumber, String ssn) {
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"));
        WebElement lastName = driver.findElement(By.id("customer.lastName"));
        WebElement address = driver.findElement(By.id("customer.address.street"));
        WebElement city = driver.findElement(By.id("customer.address.city"));
        WebElement state = driver.findElement(By.id("customer.address.state"));
        WebElement pincode = driver.findElement(By.id("customer.address.zipCode"));
        WebElement phoneNumber = driver.findElement(By.id("customer.phoneNumber"));
        WebElement SSN = driver.findElement(By.id("customer.ssn"));

        firstName.click();
        firstName.sendKeys(FirstName);

        lastName.click();
        lastName.sendKeys(LastName);

        address.click();
        address.sendKeys(Address);

        city.click();
        city.sendKeys(City);

        state.click();
        state.sendKeys(State);

        pincode.click();
        pincode.sendKeys(Zipcode);

        phoneNumber.click();
        phoneNumber.sendKeys(PhoneNumber);

        SSN.click();
        SSN.sendKeys(ssn);
    }

    @Then("{string} {string}")
    public void jo_whlae_abc(String UserName, String Password) {
        WebElement userName = driver.findElement(By.id("customer.username"));
        WebElement password = driver.findElement(By.id("customer.password"));
        WebElement resenDpassword = driver.findElement(By.id("repeatedPassword"));

        userName.click();
        userName.sendKeys(UserName);

        password.click();
        password.sendKeys(Password);

        resenDpassword.click();
        resenDpassword.sendKeys(Password);
    }

    @Then("click Register {string}")
    public void click_register(String UserName) {
        WebElement Submitbutton = driver.findElement(By.cssSelector("td > .button"));
        String Title = driver.getTitle();
        assertThat(Title.contains(UserName));
        Submitbutton.click();
        driver.quit(); //close window

    }
}
