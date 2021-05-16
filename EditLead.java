package week5.day1.assignment;



import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class EditLead extends BaseClass{

	@Test(dependsOnMethods="week5.day1.assignment.CreateLead.createLead")
	public void updateLead() throws InterruptedException {
		
		//Click leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		
		
		//Find  First name and enter values
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("TestFNxyz");
		
		//Click Find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
	
	
		//click the first matching
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		
		String text3 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text3 +":is the title displayed");
		
		
		//Click Edit
		driver.findElement(By.linkText("Edit")).click();
		
			
		
		// Clear company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		//Update company name
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Paypal");
		driver.findElement(By.xpath("(//Input[@name='submitButton'])[1]")).click();
		
		String updateComp = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(updateComp +":is the updated company Name");
		if (updateComp.contains("TransUnion"))
		{
			System.out.println("Company name is verified");
		}
		
		else
		{
			System.out.println("Company name is wrongly updated");
		}
		
		
	}

}