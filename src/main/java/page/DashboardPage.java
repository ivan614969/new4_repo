package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage extends BasePage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.LINK_TEXT, using = "New Customer")
	WebElement NewCustomer_Locator;
	@FindBy(how = How.LINK_TEXT, using = "Subscription")
	WebElement Sub_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"subscriptionPanel\"]/div[1]/ul/li/div[1]")
	WebElement NewSub_Locator;
	@FindBy(how = How.NAME, using = "recurringServiceType")
	WebElement RecurService_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"scheduleWrapper\"]/div[2]/h4")
	WebElement TwoMonth_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"scheduleWrapper\"]/div[2]/h4")
	WebElement OneMonth_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"subscriptionAccordion\"]/div[1]/div[3]/div/div/div[1]/select[1]")
	WebElement Initial_Locator;

	public void clickNewCustomer() {
		NewCustomer_Locator.click();
	}

	public void clickOnSubscription() {
		waitForElement(Sub_Locator, driver);
		Sub_Locator.click();
	}

	public void clickNewSub() {
		NewSub_Locator.click();
	}

	public void selectRecurringService() {
		Select drpdown = new Select(RecurService_Locator);
		drpdown.selectByVisibleText("Alternate Monthly");
	}

	public String getRecurringDate() throws InterruptedException {
		Thread.sleep(2000);
		return TwoMonth_Locator.getText();
	}

	public void selectSchedulingService() {
		Select initial_followup = new Select(Initial_Locator);
		initial_followup.selectByVisibleText("1 Month");
	}

	public String getSchedulingDate() throws InterruptedException {
		waitForElement(OneMonth_Locator, driver);
		return OneMonth_Locator.getText();
	}

}
