package SeleniumPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox1 {

    public static void main(String args[])
    {
    	
       WebDriverManager.chromedriver().setup();
  	   WebDriver driver =new ChromeDriver();
  	   driver.get(" https://www.ironspider.ca/forms/checkradio.htm");
  	   driver.manage().window().maximize();
  	
    	List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and @name='color']"));
    	
//    	  for(int i=0;i<CheckBoxes.size();i++ )
//    	  {
//    		  
//             CheckBoxes .get(i).click();
//    		  
//    	  }
    
    	for(WebElement checkbox:CheckBoxes)
       {
        	
    	  String checkboxvalue = checkbox.getAttribute("value");
        	
    	   
    	  
    	  if(checkboxvalue.equalsIgnoreCase("red")||checkboxvalue.equalsIgnoreCase("green"))
       {
    	   checkbox.click();
    	   
       }    
    		   
       else if(checkboxvalue.equalsIgnoreCase("yellow")||checkboxvalue.equalsIgnoreCase("purple"))
         {
    	   
    	   checkbox.click();
         }
       
       }
    
    
    
    
    }


}
