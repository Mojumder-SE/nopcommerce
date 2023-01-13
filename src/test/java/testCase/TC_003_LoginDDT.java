package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass{
	
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void test_loginDDT(String email,String password, String exp) //data provider passing 3 parameter from excle file Username, Passwor, expexted data also thats what we take 3 perameter
	{
		logger.info("***** Starting TC_003_LoginDDT*****");
		
		try
		{
		
		
		HomePage hp = new HomePage(driver);
		
		hp.clickLogin();
		logger.info("Clicked on Login Link");
		
		LoginPage lp = new LoginPage(driver);
		logger.info("Providing login details");
		
		//rb object from BaseClass
		lp.setEmail(email);
		lp.setPassword(password); 
		lp.clickLogin();
		logger.info("Clicked on Login button");
		
		MyAccountPage macc =new MyAccountPage(driver);
		boolean targetpage=macc.isMyAccountPageExists();
		
		if (exp.equals("Valid"))
		{
			if(targetpage==true)
			{
				macc.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equals("Invalid"))
		{
			if(targetpage==true)
			{
				macc.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
			
		
		logger.info("***** Finished TC_003_LoginDDT*****");
	}
	
	

}
