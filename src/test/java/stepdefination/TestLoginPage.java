package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.time.Duration;

public class TestLoginPage {

    WebDriver driver;

    @Given("^Open Browser Enter url$")
    public void open_browser_enter_url() {
        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Then("^enter \"([^\"]*)\" and \"([^\"]*)\" in step$")
    public void enter_username_and_password_in_step(String Username, String Password) {
        System.out.println("Username: " + Username);
        System.out.println("Password: " + Password);

        // Use explicit wait to handle synchronization
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate and interact with username field
        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        user.sendKeys(Username);

        // Locate and interact with password field
        WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        pass.sendKeys(Password);

        // Locate and click the login button
        WebElement butt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        butt.click();

        // Verification after login
        boolean status = driver.getPageSource().contains("Dashboard");
        if (status) {
            System.out.println("Login Successful for user: " + Username);
        } else {
            System.out.println("Login Failed for user: " + Username);
        }
    }
}
