package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	
	@Test (groups= {"Regression","Master"})
	public void test_account_Registration()
	{
		
		logger.debug("application logs.....");
		logger.info("***  Starting TC_001_AccountRegistrationTest  ***");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clicRegister();
		logger.info("Clicked on register link");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		logger.info("Providing customer data");
		
		regpage.setmalbtn();
		
		//regpage.setFirstName("abc");
		regpage.setFirstName(randomeString()); // randomly generate FristName
		
		//regpage.setLastName("xyz");
		regpage.setLastName(randomeString()); //rendomly generate LastName
		
		//regpage.setEmail("lydheb@gmail.com");
		regpage.setEmail(randomeString()+"@gmail.com"); //rendomly generate email
		
		// AcRegPage.setPhoneNumber(randomeNumber()) //rendomly phone number
		
		
		//regpage.setPassword("test123");
		//regpage.setConfirmPassword("test123");
		
		//regpage.setPassword(randomAlphaNumeric());
		
		String password=randomAlphaNumeric(); //this statement will use while we have two password fild and it will generated same password
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
	
		
		regpage.setClkRegister();
		logger.info("Clicked on continue");
		
		String confmsg=regpage.getRegistrationCompletedmsg();
		logger.info("Validating expected message");
		
		Assert.assertEquals(confmsg, "Your registration completed" , "test failed");
		
		}
		catch (Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("***  Finished TC_001_AccountRegistrationTest  ***");
		
	}
	

}
