package SeleniumPractice1;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumValidations {


    public static void main(String args[])
    {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver =new ChromeDriver();
    	driver.get("https://www.instagram.com/accounts/emailsignup/?h1=en");
    	driver.manage().window().maximize();
    	
    	//verifying if element is displayed or not
    	
    boolean isElementDisplayed = driver.findElement(By.xpath("//*[text()='Log in with Facebook']")).isDisplayed();
    
       Assert.assertTrue(isElementDisplayed, "The element is not displayed on signup page");
    
      //verify if element is disabled
       
       boolean isElementDisabled = driver.findElement(By.xpath("//*[text()='Sign up']")).isEnabled();
       
       Assert.assertFalse(isElementDisabled,"The element should not be enabled");
       
       driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("8830714364");
       driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Test1");
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Test2");
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("amol@123");
    
       
       //Verify if element is enabled
       boolean isElementEnabled = driver.findElement(By.xpath("//*[text()='Sign up']")).isEnabled();
    
        Assert.assertTrue(isElementEnabled, "The element is disabled");
    }


}
