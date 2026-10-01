package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E_Cucumber_Scenario_StepDefinition {

	WebDriver driver = new ChromeDriver();

	@Given("user enters username")
	public void user_enters_username() {

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

	}

	@And("enters password")
	public void enters_password() {

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@When("click on login button")
	public void click_on_login_button() {

		driver.findElement(By.name("login-button")).click();

	}

	@Then("user able to get Home page")
	public void user_able_to_get_home_page() {

		System.out.println(driver.getTitle());

		WebElement title = driver.findElement(By.xpath("//div[@class='header_label']//div[text()='Swag Labs']"));
		String homeText = title.getText();

		Assert.assertTrue(driver.getTitle().contains(homeText));
		System.out.println("Login successfull");

	}

}
