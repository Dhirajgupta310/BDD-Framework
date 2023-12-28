package Stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTable {

	WebDriver driver;

	@Given("user on login Page")
	public void user_on_login_page() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("user is on Login Page");
	}

	@When("User Enters email and Password")
	public void user_enters_email_and_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<List<String>> data = dataTable.cells();
		driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
		Thread.sleep(2000);
		System.out.println("User Enters email");

		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		System.out.println("User Enters Password");
		Thread.sleep(2000);

	}

	@Then("User Click On Sumbit Button")
	public void user_click_on_sumbit_button() {
		driver.findElement(By.id("submit")).click();

	}

	@Then("User Verifies The Title")
	public void user_verifies_the_title() {
		System.out.println(" Verified The Title is :" + driver.getTitle());

	}

	@Then("User Click On Add New Contact Button")
	public void user_click_on_add_new_contact_button() throws InterruptedException {
		driver.findElement(By.id("add-contact")).click();
		Thread.sleep(2000);
		System.out.println("User Click on new contact Button");

	}

	@Then("User Enters Presonal Information")
	public void user_enters_presonal_information(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<List<String>> data1 = dataTable.cells();

		driver.findElement(By.id("firstName")).sendKeys(data1.get(0).get(1));

		driver.findElement(By.id("lastName")).sendKeys(data1.get(1).get(1));

		driver.findElement(By.id("birthdate")).sendKeys(data1.get(2).get(1));

		driver.findElement(By.id("email")).sendKeys(data1.get(3).get(1));

		driver.findElement(By.id("phone")).sendKeys(data1.get(4).get(1));

		driver.findElement(By.id("street1")).sendKeys(data1.get(5).get(1));

		driver.findElement(By.id("city")).sendKeys(data1.get(6).get(1));

		driver.findElement(By.id("country")).sendKeys(data1.get(7).get(1));
		Thread.sleep(2000);
		System.out.println("User enters Personal Information");

		driver.close();

	}

}
