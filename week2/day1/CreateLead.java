package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	//Launch the browser
	
	public static void main(String[] args) throws InterruptedException 
		{
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
			
			
	// create lead button
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
			
			
	//To close the browser 	
			//driver.close();	
			//Thread.sleep(5000);
		 
}

}