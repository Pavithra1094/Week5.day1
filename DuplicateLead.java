package week5.day1.assignment;


import org.openqa.selenium.By;

import org.testng.annotations.Test;





public class DuplicateLead extends BaseClass {

	@Test
	public void dupLead() throws InterruptedException {
		
		
		//Click leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Enter email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("xyz123@gmail.com");
		
		//Click Find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		//Capture first matching
		String capturedname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).getText();
		System.out.println(capturedname);
	
		//click the first matching
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		
		//Click duplicate
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		String text3 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text3 +":is the title displayed");
		
		if(text3.equals("Duplicate Lead"))
		{
			System.out.println("Title verified-Pass");
		}
		else
		System.err.println("Title verified-Fail");
		
		//Click create lead
		driver.findElement(By.xpath("//Input[@class='smallSubmit']")).click();
		
		String dupname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(dupname);
		
		if(dupname.equals(capturedname))
		{
			System.out.println("Duplicated lead name is same as captured name");
		}

		
		else
		{
	
		
			System.out.println("Duplicated lead name is not same as captured name");
		
		
		}
		
		
	}

}