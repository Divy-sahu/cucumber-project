package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class A {
	
	WebDriver driver;
	
	@Given("Open Browser")
	public void open_browser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("Verify page")
	public void verify_page() {
	    
		String title = driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Test case pass");
		}
		else 
		{
			System.out.println("Test case fail");
		}
	}

}
