package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginfunctionality {
	WebDriver driver;
	@Given("user is on Login Page")
	public void user_is_on_login_page() throws Exception {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://thinking-tester-contact-list.herokuapp.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   System.out.println("user is on Login Page");
	}

	@When("user enters User name")
	public void user_enters_user_name() throws Exception {
		driver.findElement(By.id("email")).sendKeys("Demo123@gmail.com");
		Thread.sleep(2000);
		System.out.println("user enters User name");
	   
	}

	@When("user enters Password")
	public void user_enters_password() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("123456789");
		Thread.sleep(2000);
		System.out.println("user enters Password");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
	   driver.findElement(By.id("submit")).click();
	   System.out.println("user click on login button");
	    
	}

	@Then("user is verifying the title")
	public void user_is_verifying_the_title() throws InterruptedException {
	String Title= driver.getTitle();
	System.out.println("Title of page is :"+Title);
	Thread.sleep(3000);
	
	    driver.close();
	    
	}




}
