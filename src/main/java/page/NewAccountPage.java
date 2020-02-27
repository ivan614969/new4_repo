package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage {
	WebDriver driver;

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.LINK_TEXT, using = "New Customer")
	WebElement NewCustomer_Locator;
	@FindBy(how = How.XPATH, using = "//input[@name='fname']")
	WebElement FirstName_Locator;
	@FindBy(how = How.XPATH, using = "//input[@name='lname']")
	WebElement LastName_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"daysPage\"]/div[13]/div[3]/div/button[1]")
	WebElement SubmitButton;

	public void fillInSubscriptionForm(String first_Name, String last_Name) throws InterruptedException {
		NewCustomer_Locator.click();
		Thread.sleep(2000);
		FirstName_Locator.sendKeys(first_Name);
		LastName_Locator.sendKeys(last_Name);
		SubmitButton.click();

	}
//	public void waitForPage() {
//		waitForElement(NewAccountsPageTitle, driver);		
//	}
}
