package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Car {

	WebDriver.driver=null;
	driver=new ChromeDriver();

	//Check if at least one car listing
	@Given("User is on browser page")
	public void user_is_on_browser_page() {
		System.out.println("Inside step- user enters browser page");
		String.projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");

		driver.navigate().to("https://www.tmsandbox.co.nz/");
		driver.manage().timeouts().implicitWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeOut(40,TimeUnit.SECONDS);


	}

	@When("user enter usedcars in search box")
	public void user_enter_usedcars_in_search_box() {
		System.out.println("Inside step- user enters usedcars");
		driver.findElement(By.name("searchString")).sendKeys("usedcars");
	}

	@And("clicks on enter button")
	public void clicks_on_enter_button() {
		System.out.println("Inside step- user clicks enter");
		driver.findElement(By.name("searchString")).sendKeys(keys.ENTER);
	}

	@Then("user should be able to view at least one listing in UsedCars category")
	public void user_should_be_able_to_view_at_least_one_listing_in_used_cars_category() {
		System.out.println("Inside step- user is able to view at least one listing");
		driver.getPageSource().contains("used cars");

		if(isDisplayed) {
			System.out.println("used car is displayed");
		}
		else {
			System.out.println("used car is not displayed")
		}
	}


	//check if Kia is displayed

	@Given("user is on used cars page")
	public void user_is_on_used_cars_page() {
		System.out.println("Inside step- user enters used cars page");
	}

	@When("user enters {string} in search box")
	public void user_enters_in_search_box(String string) {
		System.out.println("Inside step- user enters Kia in search box");
		driver.findElement(By.name("searchString")).sendKeys("Kia");
	}

	@And("clicks enter button")
	public void clicks_enter_button() {
		System.out.println("Inside step- user clicks enter");
		driver.findElement(By.name("searchString")).sendKeys(keys.ENTER);
	}

	@Then("user should be able to view {string} in UsedCars category")
	public void user_should_be_able_to_view_in_used_cars_category(String string) {
		System.out.println("Inside step- user is able to view Kia ");
		driver.getPageSource().contains("Kia");

		if(isDisplayed) {
			System.out.println("Kia is displayed");
		}
		else {
			System.out.println("Kia is not displayed");
		}
	}


	//confirm the car details
	@Given("user is on Usedcars page")
	public void user_is_on_usedcars_page() {
		System.out.println("Inside step- user enters usedcars page ");

	}

	@When("user enters specific <Car Details> in the filter category")
	public void user_enters_specific_car_details_in_the_filter_category() {
		System.out.println("Inside step- user enters car details ");
		driver.findElement(By.name("searchString")).sendKeys("LWT143");
		driver.findElement(By.name("searchString")).sendKeys("65,000");

	}

	@When("clicks on Enter button")
	public void clicks_on_Enter_button() {
		System.out.println("Inside step- user clicks Enter ");
		driver.findElement(By.name("searchString")).sendKeys(keys.ENTER);

	}

	@Then("user should be able to confirm the given car details")
	public void user_should_be_able_to_confirm_the_given_car_details() {
		System.out.println("Inside step- user is able to confirm details displayed ");
		driver.getPageSource().contains("Number Plate");

		if(isDisplayed) {
			System.out.println("lWT143 is displayed");
		}
		else {
			System.out.println("LWT143 is not displayed");
			Thread.sleep(4000);
		}
	}

	driver.getPageSource().contains("Kilometers");
	if(isDisplayed) {
		System.out.println("65,000 is displayed");
	}
	else {
		System.out.println("65,000 is not displayed");
	}
}


}

