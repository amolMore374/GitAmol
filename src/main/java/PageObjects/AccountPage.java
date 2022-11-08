package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	   WebDriver driver;

	   public AccountPage(WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver, this); 
	   }

      @FindBy(xpath="//a[normalize-space()='Edit your account information']") private WebElement edit_your_acc_info;
      
      
      public WebElement edit_your_acc_info()
      {
    	 return edit_your_acc_info;
    	  
      }




}
