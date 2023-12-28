package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDriven {
	WebDriver driver;
	@Given("User is on LoginPage")
	public void user_is_on_login_page() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   System.out.println("User has navigateed to LoginPage");
	  
	}

	@When("User is providing {string} & {string}")
	public void user_is_providing(String Username, String Password) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(Username);
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys(Password);
		Thread.sleep(3000);
		System.out.println("User has enter UserName & Password");

	}

	@Then("User is clicking on Submit Button")
	public void user_is_clicking_on_submit_button() throws InterruptedException {
	   driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		System.out.println("User has clicked on submit Button");

	}

	@Then("Verifying the Title of page")
	public void verifying_the_title_of_page() throws InterruptedException {
	System.out.println("Verify the Title is :"+ driver.getTitle());
	Thread.sleep(3000);
	driver.close();

	
	}



	
	
	
	

}
