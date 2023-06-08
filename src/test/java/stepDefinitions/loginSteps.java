package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginSteps {
	WebDriver driver;
	@Given("I enter the url of saucedemo website")
	public void i_enter_the_url_of_saucedemo_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\lib\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions(); 
		  options.addArguments("--remote-allow-origins=*"); 
		  driver = new ChromeDriver(options); 
		driver.get("https://www.saucedemo.com/");
	}

	@When("I enter valid username")
	public void i_enter_valid_username() {
	driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	}

	@When("I enter valid password")
	public void i_enter_valid_password() {
	    driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
	}

	@When("I enter login button")
	public void i_enter_login_button() {
	    driver.findElement(By.cssSelector("#login-button")).click();
	}

	@Then("I will reach the HomePage for products")
	public void i_will_reach_the_HomePage_for_products() {
		WebElement logo = driver.findElement(By.cssSelector(".app_logo"));
		if (logo.isDisplayed()) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		driver.quit();

	}
	
}
