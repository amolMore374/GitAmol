package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 WebDriver driver;
     public LoginPage(WebDriver driver)
	   {
		  
		   this.driver=driver;
		   PageFactory.initElements(driver, this); 
	   }

      @FindBy(xpath="//input[@id='input-email']") private WebElement emailAddressfield;
      @FindBy(xpath="//input[@id='input-password']") private WebElement passwordfield;
      @FindBy(xpath="//input[@value='Login']") private WebElement loginButton;


    public WebElement emailAddressfield()
    {
    	return emailAddressfield;
    	
    }

    public WebElement passwordfield()
    {
    	
    	return passwordfield;
    	
    }

    public WebElement loginButton()
    {
    	return loginButton;
    	
    }



}
