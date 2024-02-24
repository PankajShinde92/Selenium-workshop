package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdemo {

    public static void main(String[] args) throws InterruptedException {

        //Create method Navigate --------------------------
        //Create a Selenium WebDriver instance
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        //Configure the Web browser
        driver.manage().window().maximize();

        //Navigate to the web URL
        driver.get("https://apps.usewhale.io/trial");
        System.out.println(driver.getTitle());
        //-----------------------------------------------------------

        //-----------------------------------------------------------
        Thread.sleep(3000);
        //Capturing all the needed Webelements into the variable
        WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        WebElement clickCheck = driver.findElement(By.className("PrivateSwitchBase-input"));
        WebElement signUp = driver.findElement(By.id("sign_up_conversion"));

        //action methods
        username.sendKeys("abc@gmail.com");

        //-----------------------------------------------------------
        firstName.sendKeys("Hyam");
        lastName.sendKeys("Whale");

        //-----------------------------------------------------------
        boolean isSelected = clickCheck.isSelected();
        //Validate Checkbox isSelected method and click
        if(isSelected == false) {
            clickCheck.click();
            System.out.println(clickCheck.getAccessibleName());
        }

        //-----------------------------------------------------------
        boolean isEnabled = signUp.isEnabled();
        //Validate checkbox using isEnabled() and then click
        if (isEnabled == true) {
            signUp.click();
        }

//        boolean isDisplayed = signUp.isDisplayed();
//        //Validate Checkbox using isDisplayed() and click
//        if (isDisplayed == true) {
//            signUp.click();
//        }

        Thread.sleep(3000);
        driver.quit(); //close window
    }
}
