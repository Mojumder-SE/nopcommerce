package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super (driver);
	}
	
	@FindBy (xpath = "//input[@id='gender-male']")
	WebElement clickmalbtn;
	
	@FindBy (xpath = "//input[@id='FirstName']")
	WebElement txtFirstname;
	
	@FindBy (xpath = "//input[@id='LastName']")
	WebElement txtLastname;
	
	@FindBy (xpath = "//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy (xpath = "//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy (xpath = "//input[@id='ConfirmPassword']")
	WebElement txtConfirmPassword;
	
	@FindBy (xpath = "//button[@id='register-button']")
	WebElement clkbtnRegister;
	
	@FindBy (xpath = "//div[@class='result']")
	WebElement msgConfirmation;
	
	
	public void setmalbtn()
	{
		clickmalbtn.click();
	}
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String cpassword)
	{
		txtConfirmPassword.sendKeys(cpassword);
	}
	
	public void setClkRegister()
	{
		clkbtnRegister.click();
	}
	
	public String getRegistrationCompletedmsg()
	{
		try
		{
		return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	

}
