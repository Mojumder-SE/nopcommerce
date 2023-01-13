package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super (driver);
	}
	
	// Elements
	
	@FindBy (xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[normalize-space()='Log in']")
	WebElement linkLogin;
	
	
	//Actions Methods
	
	public void clicRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		linkLogin.click();
	}

}
