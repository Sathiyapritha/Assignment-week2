package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException  {
		
		//Launch the browser
		
			ChromeDriver driver = new ChromeDriver();
			
	    // //To maximise the window		
			driver.manage().window().maximize();
				
	   // Load URL 
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			// sytext to find username & password
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				Thread.sleep(1000);
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				Thread.sleep(1000);
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				Thread.sleep(1000);
				
				
		// create lead text button
				driver.findElement(By.linkText("Leads")).click();
				Thread.sleep(1000);
					
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathiya");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pritha");
				
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MRS");
				driver.findElement(By.name("departmentName")).sendKeys("Software Testing");
				
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello Test Leaf!!!");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyadsd@gmail.com");
		
		// Select web elements
				
				WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				  Select city = new Select(state);
				  city.selectByVisibleText("New York");
				  //Thread.sleep(1000);
				  
		//click on create lead button		  
				  
				 driver.findElement(By.name("submitButton")).click();

					
	  //Edit lead button starts here
				  
			driver.findElement(By.linkText("Edit")).click();
				
	 //Clear the Description field
			WebElement clearBox =driver.findElement(By.xpath("//*[@id='updateLeadForm_description']"));
			  clearBox.clear();////
				
		  WebElement notefield = driver.findElement(By.id("updateLeadForm_importantNote"));
		      notefield.sendKeys("Lets connect with Testleaf");     
		     
				
				Thread.sleep(1000);
		
	//click on Update lead button		  
				  
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		
   //To close the browser 	
	   // driver.close();
	 //   Thread.sleep(4000);
		
	}

}
