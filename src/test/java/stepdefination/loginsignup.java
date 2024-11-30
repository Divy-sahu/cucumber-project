package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsignup {
	
	WebDriver driver;
	@Given("Open webbrowser")
	
	public void Open_webbrowser() {
      driver = new ChromeDriver();
      driver.get("https://automationexercise.com/");
      driver.manage().window().maximize();
	}

	@When("veriy home page")
	public void veriy_home_page() {
	    String source = driver.getPageSource();
	    if(source.equals("Category")) {
	    System.out.println("test case pass");
	    }
	    else {
			System.out.println("test case fail");
		}
	}

	@Then("click on login signup button")
	public void click_on_login_signup_button() {
	    WebElement lobutton = driver.findElement(By.xpath("//a[contains (text(), ' Signup / Login')]"));
	    lobutton.click();
	}
	
	@And("Verify 'New User Signup!' is visible")
	public void Verify_New_User_Signup_visible() {
	    
		boolean title = driver.getPageSource().contains("New User Signup!");
	    if(title == true) {
	    System.out.println("test case pass");
	    }
	    else {
			System.out.println("test case fail");
		}
	}

	@When("user able to fill details")
	public void user_able_to_fill_details() {
	    
		WebElement name = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		WebElement email = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		name.clear();
		name.sendKeys("divyansh");
		email.clear();
		email.sendKeys("divyansh123@gmail.com");
		
	}

	@Then("click on signup button")
	public void click_on_signup_button() {
	    WebElement signupbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
	    signupbutton.click();
	}




}
