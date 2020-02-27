package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.LoginPage;
import page.NewAccountPage;
import utilitiy.Assertion;
import utilitiy.BrowserFactory;

public class NewAccountSteps {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	NewAccountPage newAccountsPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		newAccountsPage = PageFactory.initElements(driver, NewAccountPage.class);
	}

	@Given("^a customer logged in using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void a_customer_logged_in_using_and(String username, String password) throws Throwable {
		loginPage.login(username, password);

	}

	@When("^customer clicks New Customer button$")
	public void customer_clicks_New_Customer_button() throws Throwable {
		dashboardPage.clickNewCustomer();

	}

	@When("^user submits \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_submits_and(String first_Name, String last_Name) throws Throwable {
		newAccountsPage.fillInSubscriptionForm(first_Name, last_Name);

	}

	@When("^user navigates to Subscription -> New Subscription$")
	public void user_navigates_to_Subscription_New_Subscription() throws Throwable {
		dashboardPage.clickOnSubscription();
		Thread.sleep(2000);
		dashboardPage.clickNewSub();

	}

	@When("^customer choose Recurring Service Alternate Monthly$")
	public void customer_choose_Recurring_Service_Alternate_Monthly() throws Throwable {
		Thread.sleep(3000);
		dashboardPage.selectRecurringService();

	}

	@Then("^upcoming service should be Two months from now at \"([^\"]*)\"$")
	public void upcoming_service_should_be_Two_months_from_now_at(String Recurring_Date) throws Throwable {
		String expectedDate = Recurring_Date;
		Assertion.equals("Didn't Alternate Monthly", dashboardPage.getRecurringDate(), expectedDate);

	}

	@When("^customer choose Initial follow-up to be One month$")
	public void customer_choose_Initial_follow_up_to_be_One_month() throws Throwable {
		dashboardPage.selectSchedulingService();
	}

	@Then("^upcoming service should be One month from now at \"([^\"]*)\"$")
	public void upcoming_service_should_be_One_month_from_now_at(String Followup_Date) throws Throwable {
		String ExpectedDate = Followup_Date;
		Assertion.equals("Scheduled Wrong Date", dashboardPage.getSchedulingDate(), ExpectedDate);

	}

	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}

}
