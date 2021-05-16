package week5.day1.assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{

	@Test
	public void createLead() {
		
		//Click contacts
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
	
		//Find the First name and type the value
		driver.findElement(By.id("firstNameField")).sendKeys("TestFNxyz");
		
		//Find the First name and type the value
		driver.findElement(By.id("lastNameField")).sendKeys("TestLN");
		
		//Find the dept and type the value
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Computer software Department1");
		
		//Find the description and type the value
		driver.findElement(By.id("createContactForm_description")).sendKeys("Description");
		
		//Find the email add and type the value
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("xyz123@gmail.com");
		

		// From the drop down choose State
	
		WebElement eleDropDown1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1=new Select(eleDropDown1);
		dd1.selectByVisibleText("New York");
		
		//Find create contact and click
		driver.findElement(By.className("smallSubmit")).click();
		
		//Find editbutton and click
		driver.findElement(By.className("subMenuButton")).click();
		
		//Find description note and clear and pass value
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_description")).sendKeys("Updated description");
		
		//Find update and click
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
	
		System.out.println(driver.getTitle());	
		
		
	}

}