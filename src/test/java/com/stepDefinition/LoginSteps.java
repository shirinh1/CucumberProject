package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
		System.out.println("Step1: User is on login page");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	   // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		System.out.println("Step2: User enters username and password");
		driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@And("click on login button")
	public void click_on_login_button() {
		
		System.out.println("Step3: User is clicking on login button");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).sendKeys(Keys.ENTER);
		
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
	    
		System.out.println("Step4: User lands on home page");
		//driver.close();
		
	}

}
