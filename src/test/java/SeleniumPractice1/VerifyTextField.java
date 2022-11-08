package SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTextField {

    public static void main(String args[])

    {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        
     // Locating firstname web element
        
      WebElement UserNameInputBox = driver.findElement(By.name("username"));
        
   // Type more than 10 characters as max limit is defined as 10 as per requirement
      
      UserNameInputBox.sendKeys("hhccttteeeeesffffffjjhgfffhhhhyyterg");
      
  	// Get the typed value
      
     String typedvalue = UserNameInputBox.getAttribute("value");
     
     System.out.println(typedvalue);
  
     
     
     // Get the length of typed value
  		int size = typedvalue.length();
  		
  		System.out.println(size);
   
  		//Assert with expected
		if (size == 36) {
			System.out.println("Max character functionality is working fine.");
		}
 
		else {
			System.out.println("No limit is set.");
  }
      
      
      
    	
    
    
    
    }





}
