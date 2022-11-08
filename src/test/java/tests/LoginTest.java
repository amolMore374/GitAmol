

package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import PageObjects.AccountPage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;


public class LoginTest extends Base {
	 
	Logger log;
	
	WebDriver driver;
    
	
	@Test(dataProvider="getLoginData")
	public void login(String email,String password,String Expectedresult) throws IOException, InterruptedException

    {
    	
    	 log = LogManager.getLogger(LoginTest.class.getName());
    	 
    	LandingPage landingPage =new LandingPage(driver);
    	
    	landingPage.myAccDropdown().click();
    	log.debug("Clicked on My Account dropdown");
    	landingPage.loginOption().click();
    	log.debug("Clicked on login option");
         
    	Thread.sleep(3000);
        LoginPage loginpage = new LoginPage(driver);
        
        loginpage.emailAddressfield().sendKeys(email);
        Thread.sleep(5000);
        log.debug("Email addressed got entered");
        
        loginpage.passwordfield().sendKeys(password);
       
        log.debug("Password got entered");
        loginpage.loginButton().click();
        
        log.debug("Clicked on Login Button");
      
        AccountPage accountPage = new AccountPage(driver)  ;        
        
       
        String actualResult;
        try {
        accountPage.edit_your_acc_info().isDisplayed();
        actualResult= "Successfull";
        log.debug("User got logged in");
        
        
        }catch(Exception e) {
        	
        log.debug("User didn't log in");
        actualResult="Failure";
        }
        
        Assert.assertEquals(actualResult, Expectedresult);
    
    
    }
     
	
	 @BeforeMethod
	   public void OpenApplication() throws IOException
	   {
	   driver = InitialiseDriver();
	   log.debug("Browser got launched");
	   
	   driver.get("http://tutorialsninja.com/demo/");
	   log.debug("Browser got launched");
	   }
	   
	 
	   @AfterMethod
		public void teardown()
		{
			driver.close();
			log.debug("Browser got closed");
		
		}	
	 
	 
	 @DataProvider
	 public  Object[][] getLoginData() {

           Object[][] data = {{"amoldahibhate88@gmail.com","amol@123","Successfull"},{"dummy@test.com","dummy","Failure"}};

             return data;
	 
	 }
	 
       
	 




}
