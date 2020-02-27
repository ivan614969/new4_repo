package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "inputUser")
	WebElement userName;
	@FindBy(how = How.ID, using = "inputPassword")
	WebElement passWord;
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	WebElement SubmitButton;

	public void login(String username, String password) throws InterruptedException {
		userName.sendKeys(username);
		passWord.sendKeys(password);
		Thread.sleep(1000);
		SubmitButton.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

}
