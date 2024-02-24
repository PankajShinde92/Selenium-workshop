package Navigate;

import io.cucumber.junit.Cucumber;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Cucumber.class)
public class Webpagehomepage {


    WebDriver driver = new ChromeDriver();

    @Step("Open the login page")
    public void Webhomepage() throws InterruptedException {

        //Create a Selenium WebDriver instance
        System.setProperty("webdriver.chrome.driver","chromedriver");
        //Configure the Web browser
        driver.manage().window().maximize();

        //Navigate to the web URL
        driver.get("https://apps.usewhale.io/trial");
        Thread.sleep(8000);
        String title = driver.getTitle();
        //Assert and match the value.
        assertThat(title.contains("Whale"));

    }

    @Step("Enter Email")
    public void enterEmail() {
        WebElement emailid = driver.findElement(By.xpath("//input[@name='email']"));
        //action methods
        emailid.sendKeys("abc@gmail.com");
    }


    @Step("Enter first name")
    public void firstName() {
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        //action methods
        firstName.sendKeys("Hyam");
    }

    @Step("Enter last name")
    public void lastName() {
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        //action methods
        lastName.sendKeys("Whale");
    }

    @Step("Enter selectCheckbox")
    public void selectCheckbox() {
        WebElement clickCheck = driver.findElement(By.className("PrivateSwitchBase-input"));
        //action methods
        boolean isSelected = clickCheck.isSelected();
        //Validate Checkbox isSelected method and click
        if(isSelected == false) {
            clickCheck.click();
            System.out.println(clickCheck.getAccessibleName());
        }
    }

    @Step("Click SignUp")
    public void clickSignup() throws InterruptedException {
        WebElement signUp = driver.findElement(By.id("sign_up_conversion"));
        //action methods
        boolean isEnabled = signUp.isEnabled();
        //Validate checkbox using isEnabled() and then click
        if (isEnabled == true) {
            signUp.click();
        }
    }

    @Step("Close Window")
    public void closeDriverwindow() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit(); //close window
    }

}
