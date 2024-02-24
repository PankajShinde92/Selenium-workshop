package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

    public static void main(String[] args) throws InterruptedException {

        //Create method Navigate --------------------------
        //Create a Selenium WebDriver instance
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        //Configure the Web browser
        driver.manage().window().maximize();

        //Navigate to the web URL
        driver.get("https://apps.usewhale.io/trial");
        System.out.println(driver.getTitle());

        Thread.sleep(7000);
        WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/div/form/div[1]/div/input"));
        username.sendKeys("abc@gmail.com");

        driver.quit();

    }
}