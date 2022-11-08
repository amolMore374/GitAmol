package SeleniumPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {

    public static void main (String args[])
    {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver =new ChromeDriver();
	   driver.get(" https://itera-qa.azurewebsites.net/home/automation");
	   driver.manage().window().maximize();
	
	   //select specific checkbox
	  //driver.findElement(By.id("monday")).click();
	  
	//select all the checkboxes
	  List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	  System.out.println("Total no of checkboxes: "+checkboxes.size());
	
	  //for loop
//	  for(int i=0;i<checkboxes.size();i++)
//	  {
//		 checkboxes.get(i).click();
//	
//	  }  
//  using for each loop
//	  
//	  for(WebElement chckbox:checkboxes)
//	  {
//		  chckbox.click();
//	}	  
    
	 //select multiple checkboxes with choice
	
//	  for(WebElement chckbox:checkboxes)
//	  {
//		  
//		String checkboxname = chckbox.getAttribute("id");
//		  
//	      if(checkboxname.equalsIgnoreCase("monday")||checkboxname.equalsIgnoreCase("sunday"))
//	      {
//	    	  
//	    	 chckbox.click();
//	    }
//	  
//	  
//	  }
	  //select last 2 checkboxes
	  int totalcheckboxes = checkboxes.size();
//	  for(int i=totalcheckboxes-2;i<totalcheckboxes;i++)
//	  {
//		  checkboxes.get(i).click();
//		  
//	  }
	  
	  //select first 3 checkboxes

       for(int i=0;i<totalcheckboxes;i++ )
       {
    	  if(i<3) 
    	  {
    	   checkboxes.get(i).click();
    	  }
    	   
       }
    
    //
    
    
    
    
    
    
    
    
    }


}
